package loops.extra_tasks.task15.main;

/*
 * Задача 15. Вычислить: 1+2+4+8+...+ 2 в 10 степени.
 */

public class Main {

    public static void main(String[] args) {
	long result = 0L;

	for (long i = 0; i <= 10; i++) {
	    result += Math.pow(2, i);
	}

	System.out.println("Результат: " + result);
    }
}