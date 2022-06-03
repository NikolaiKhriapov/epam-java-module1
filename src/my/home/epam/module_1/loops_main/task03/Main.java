package my.home.epam.module_1.loops_main.task03;

/*
 * Задача 3. Найти сумму квадратов первых ста чисел.
 */

public class Main {

    public static void main(String[] args) {
	int sum = 0;

	for (int i = 1; i <= 100; i++) {
	    sum += Math.pow(i, 2);
	}

	System.out.println("Результат: " + sum);
    }
}