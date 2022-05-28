package conditionals.extra_tasks.task19.main;

/*
 * Задача 19. Подсчитать количество положительных среди чисел а, b, с.
 */

public class Main {

    public static void main(String[] args) {
	int count = 0;

	int a = 4;
	int b = 4;
	int c = -4;

	System.out.println("Число а: " + a);
	System.out.println("Число b: " + b);
	System.out.println("Число c: " + c);

	if (a > 0) {
	    count++;
	}
	if (b > 0) {
	    count++;
	}
	if (c > 0) {
	    count++;
	}

	System.out.println("Количество положительных чисел: " + count);
    }
}