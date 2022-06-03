package my.home.epam.module_1.loops_extra.task12;

/*
 * Задача 12. Последовательность аn строится так: а1 = 1, an = 6 + аn-1 , для каждого n > 1 
 * составьте программу нахождения произведения первых 10 членов этой последовательности.
 */

public class Main {

    public static void main(String[] args) {
	long product = 1L;
	int an = 1;

	System.out.print("а1 = " + an);

	for (int i = 2; i <= 10; i++) {
	    an = 6 + an;
	    System.out.print(", a" + i + " = " + an);
	    product *= an;
	}

	System.out.println();
	System.out.println("Результат: " + product);
    }
}