package loops.extra_tasks.task13.main;

/*
 * Задача 13. Составить таблицу значений функции y = 5 - x^2 / 2 на отрезке [-5;5] с шагом 0.5.
 */

public class Main {

    public static void main(String[] args) {
	double y;
	double h = 0.5;

	for (double x = -5; x <= 5; x += h) {
	    y = 5 - (Math.pow(x, 2) / 2);

	    System.out.println("x = " + x + ", y = " + y);
	}
    }
}