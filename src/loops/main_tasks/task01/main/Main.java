package loops.main_tasks.task01.main;

/*
 * Задача 1. Напишите программу, где пользователь вводит любое целое положительное число. 
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