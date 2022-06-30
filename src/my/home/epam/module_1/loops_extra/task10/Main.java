package my.home.epam.module_1.loops_extra.task10;

/*
 * Задача 10. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Main {

    public static void main(String[] args) {
	long product = 1;

	for (int i = 1; i <= 200; i++) {
	    product *= Math.pow(i, 2);
	}

	System.out.println("Результат: " + product);
    }
}