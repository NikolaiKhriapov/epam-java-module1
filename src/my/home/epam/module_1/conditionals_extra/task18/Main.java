package my.home.epam.module_1.conditionals_extra.task18;

/*
 * Задача 18. Подсчитать количество отрицательных среди чисел а, b, с.
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

	if (a < 0) {
	    count++;
	}
	if (b < 0) {
	    count++;
	}
	if (c < 0) {
	    count++;
	}

	System.out.println("Количество отрицательных чисел: " + count);
    }
}