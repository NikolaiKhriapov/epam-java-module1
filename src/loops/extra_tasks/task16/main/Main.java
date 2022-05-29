package loops.extra_tasks.task16.main;

/*
 * Задача 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
 */

public class Main {

    public static void main(String[] args) {
	long sum = 1L;
	long product = 1L;

	for (int i = 2; i <= 10; i++) {
	    sum += i;
	    product *= sum;
	}

	System.out.println("Результат: " + product);
    }
}