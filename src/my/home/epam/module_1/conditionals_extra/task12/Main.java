package my.home.epam.module_1.conditionals_extra.task12;

/*
 * Задача 12. Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
 */

public class Main {

    public static void main(String[] args) {
	int a = 4;
	int b = -3;
	int c = 7;

	System.out.println("Число a: " + a);
	System.out.println("Число b: " + b);
	System.out.println("Число c: " + c);

	if (a < 0) {
	    System.out.println("Число а в четвертой степени равно " + Math.pow(a, 4));
	} else {
	    System.out.println("Квадрат числа а равен " + Math.pow(a, 2));
	}

	if (b < 0) {
	    System.out.println("Число b в четвертой степени равно " + Math.pow(b, 4));
	} else {
	    System.out.println("Квадрат числа b равен " + Math.pow(b, 2));
	}

	if (c < 0) {
	    System.out.println("Число c в четвертой степени равно " + Math.pow(c, 4));
	} else {
	    System.out.println("Квадрат числа c равен " + Math.pow(c, 2));
	}
    }
}