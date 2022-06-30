package my.home.epam.module_1.conditionals_extra.task20;

/*
 * Задача 20. Определить, делителем каких чисел а, b, с является число k.
 */

public class Main {

    public static void main(String[] args) {
	int k = 2;

	double a = 6;
	double b = 5;
	double c = -8;

	System.out.println("Число а: " + a);
	System.out.println("Число b: " + b);
	System.out.println("Число c: " + c);

	System.out.print("Число k = " + k + " является делителем чисел: ");

	if (a % k == 0) {
	    System.out.print("a ");
	}
	if (b % k == 0) {
	    System.out.print("b ");
	}
	if (c % k == 0) {
	    System.out.println("c ");
	}
    }
}