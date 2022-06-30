package my.home.epam.module_1.conditionals_main.task05;

/*
 * Задача 5. Вычислить значение функции.
 */

public class Main {

    public static void main(String[] args) {
	double x = 4.0;
	double y;

	if (x <= 3) {
	    y = Math.pow(x, 2) - 3 * x + 9;
	} else {
	    y = 1.0 / (Math.pow(x, 3) + 6);
	}

	System.out.println("При х = " + x + " значение функции равно " + y);
    }
}