package my.home.epam.module_1.conditionals_extra.task01;

/*
 * Задача 1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.
 */

public class Main {

    public static void main(String[] args) {
	int number1 = 4;
	int number2 = 5;

	System.out.println("Число 1: " + number1);
	System.out.println("Число 2: " + number2);
	System.out.print("Результат: ");

	if (number1 < number2) {
	    System.out.println("7");
	} else {
	    System.out.println("8");
	}
    }
}