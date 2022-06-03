package my.home.epam.module_1.loops_main.task07;

import java.util.Scanner;

/*
 * Задача 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
 * m и n вводятся с клавиатуры.
 */

public class Main {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	System.out.print("Введите число m: ");
	int m = scanner.nextInt();

	System.out.print("Введите число n: ");
	int n = scanner.nextInt();
	System.out.println();

	for (int i = m; i <= n; i++) {
	    System.out.print("Делители числа " + i + ": ");

	    for (int j = 2; j < i; j++) {
		if ((i % j) == 0) {
		    System.out.print(j + " ");
		} else {
		    continue;
		}
	    }
	}
    }
}