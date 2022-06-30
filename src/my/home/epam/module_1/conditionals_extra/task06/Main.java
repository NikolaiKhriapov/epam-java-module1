package my.home.epam.module_1.conditionals_extra.task06;

/*
 * Задача 6. Составить программу: определения наибольшего из двух чисел а и b.
 */

public class Main {

    public static void main(String[] args) {
	int a = 5;
	int b = 6;

	System.out.println("Число a: " + a);
	System.out.println("Число b: " + b);

	if (a > b) {
	    System.out.println("Наибольшее число: " + a);
	} else if (b > a) {
	    System.out.println("Наибольшее число: " + b);
	} else {
	    System.out.println("Числа равны.");
	}
    }
}