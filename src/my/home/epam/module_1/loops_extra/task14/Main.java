package my.home.epam.module_1.loops_extra.task14;

/*
 * Задача 14. Дано натуральное n. Вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
 */

public class Main {

    public static void main(String[] args) {
	int n = 10;
	double result = 0;

	for (double i = 1; i <= n; i++) {
	    result += 1 / i;
	}

	System.out.println("Число n = " + n);
	System.out.println("Результат: " + result);
    }
}