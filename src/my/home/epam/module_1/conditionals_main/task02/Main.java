package my.home.epam.module_1.conditionals_main.task02;

/*
 * Задача 2. Найти max{min(a, b), min(c, d)}.
 */

public class Main {

    public static void main(String[] args) {
	int a = 5;
	int b = 6;
	int c = 7;
	int d = 8;

	int result = Math.max(Math.min(a, b), Math.min(c, d));

	System.out.println("Число a: " + a);
	System.out.println("Число b: " + b);
	System.out.println("Число c: " + c);
	System.out.println("Число d: " + d);
	System.out.println("Результат: " + result);
    }
}