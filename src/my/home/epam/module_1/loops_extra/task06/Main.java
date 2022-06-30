package my.home.epam.module_1.loops_extra.task06;

/*
 * Задача 6. Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Main {

    public static void main(String[] args) {
	int number = 10;

	int sum = 0;

	for (int i = 1; i <= number; i++) {
	    sum += i;
	}

	System.out.println("Число a: " + number);
	System.out.println("Сумма чисел от 1 до числа а числа равна " + sum + ".");
    }
}