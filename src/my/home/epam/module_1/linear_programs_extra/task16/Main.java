package my.home.epam.module_1.linear_programs_extra.task16;

/*
 * Задача 16. Найти произведение цифр заданного четырехзначного числа.
 */

public class Main {

    public static void main(String[] args) {
	int number1 = 1234;
	int composition = 1;

	int number = number1;
	while (number > 0) {
	    composition = composition * (number % 10);
	    number = number / 10;
	}

	System.out.println("Произведение цифр числа " + number1 + " равно " + composition);
    }
}