package my.home.epam.module_1.loops_main.task08;

/*
 * Задача 8. Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.
 */

public class Main {

    public static void main(String[] args) {
	int number1 = 123;
	int number2 = 456;

	System.out.print("Цифры, входящие в числа " + number1 + " и " + number2 + ": ");

	int i = 0;
	while (number1 != 0) {
	    i = number1 % 10;
	    number1 = number1 / 10;
	    System.out.print(i + " ");
	}

	int j = 0;
	while (number2 != 0) {
	    j = number2 % 10;
	    number2 = number2 / 10;
	    System.out.print(j + " ");
	}
    }
}