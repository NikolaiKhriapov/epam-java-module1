package my.home.epam.module_1.conditionals_extra.task07;

/*
 * Задача 7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х.
 */

public class Main {

    public static void main(String[] args) {
	int a = 3;
	int b = 5;
	int c = 7;
	int x = 2;

	int result = Math.abs(a * x * x + b * x + c);

	System.out.println("Число a: " + a);
	System.out.println("Число b: " + b);
	System.out.println("Число c: " + c);
	System.out.println("Число x: " + x);

	System.out.println("Результат: " + result);
    }
}