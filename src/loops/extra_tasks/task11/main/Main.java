package loops.extra_tasks.task11.main;

/*
 * Задача 11. Составить программу нахождения разности кубов первых двухсот чисел.
 */

public class Main {

    public static void main(String[] args) {
	long difference = 1L;

	for (int i = 2; i <= 200; i++) {
	    difference -= Math.pow(i, 3);
	}

	System.out.println("Результат: " + difference);
    }
}