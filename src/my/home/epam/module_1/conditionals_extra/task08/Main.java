package my.home.epam.module_1.conditionals_extra.task08;

/*
 * Задача 8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */

public class Main {

    public static void main(String[] args) {
	double a = 3;
	double b = 5;

	double a2 = Math.pow(a, 2);
	double b2 = Math.pow(b, 2);

	System.out.println("Число a: " + a);
	System.out.println("Число b: " + b);

	if (a2 < b2) {
	    System.out.println("Квадрат числа a меньше квадрата числа b. Квадрат числа а равен " + a2);
	} else if (b2 < a2) {
	    System.out.println("Квадрат числа b меньше квадрата числа a. Квадрат числа b равен " + b2);
	} else {
	    System.out.println("Квадраты чисел равны.");
	}
    }
}