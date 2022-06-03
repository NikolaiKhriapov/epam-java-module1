package my.home.epam.module_1.conditionals_extra.task09;

/*
 * Задача 9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
 */

public class Main {

    public static void main(String[] args) {
	double a = 5;
	double b = 5;
	double c = 5;

	System.out.println("Сторона a: " + a);
	System.out.println("Сторона b: " + b);
	System.out.println("Сторона c: " + c);

	if (a == b && a == c) {
	    System.out.println("Треугольник является равносторонним.");
	} else {
	    System.out.println("Треугольник не является равносторонним.");
	}
    }
}