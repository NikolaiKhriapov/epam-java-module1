package my.home.epam.module_1.loops_extra.task07;

/*
 * Задача 7. Вычислить значения функции на отрезке [а,b] c шагом h.
 */

public class Main {

    public static void main(String[] args) {
	int a = -5;
	int b = 5;
	int h = 3;
	int y;

	System.out.println("На отрезке [" + a + "," + b + "] с шагом " + h + ":");

	for (int x = a; x <= b; x += h) {
	    if (x > 2) {
		y = x;
	    } else {
		y = (-1) * x;
	    }

	    System.out.println("При x = " + x + " y = " + y);
	}
    }
}