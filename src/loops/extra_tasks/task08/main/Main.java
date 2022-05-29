package loops.extra_tasks.task08.main;

/*
 * Задача 8. Вычислить значения функции на отрезке [а,b] c шагом h.
 */

public class Main {

    public static void main(String[] args) {
	int a = -5;
	int b = 5;
	int c = 1;
	int h = 3;
	int y;

	System.out.println("На отрезке [" + a + "," + b + "] с шагом " + h + ":");

	for (int x = a; x <= b; x += h) {
	    if (x == 15) {
		y = (x + c) * 2;
	    } else {
		y = (x - c) + 6;
	    }

	    System.out.println("При x = " + x + " y = " + y);
	}
    }
}