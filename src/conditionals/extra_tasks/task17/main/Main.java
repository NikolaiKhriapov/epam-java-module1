package conditionals.extra_tasks.task17.main;

/*
 * Задача 17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним 
 * и тем же числом, равным большему из исходных, а если равны, то заменить числа нулями.
 */

public class Main {

    public static void main(String[] args) {
	double m = 6;
	double n = 4;

	System.out.println("Число m: " + m);
	System.out.println("Число n: " + n);

	System.out.println("Результат: ");

	if (m == n) {
	    m = 0;
	    n = 0;
	} else if (m > n) {
	    n = m;
	} else {
	    m = n;
	}

	System.out.println("Число m: " + m + ", число n: " + n);
    }
}