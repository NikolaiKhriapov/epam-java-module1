package my.home.epam.module_1.loops_extra.task17;

/*
 * Задача 17. Даны действительное (а) и натуральное (n). Вычислить: a(a+1)...(a+n-1).
 */

public class Main {

    public static void main(String[] args) {
	double a = 3;
	int n = 4;
	double result = 1;

	for (int i = 0; i < n; i++) {
	    result *= a + i;
	}

	System.out.println("При (a) = " + a + " и (n) = " + n + " результат: " + result);
    }
}