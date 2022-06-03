package my.home.epam.module_1.conditionals_main.task03;

/*
 * Задача 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Main {

    public static void main(String[] args) {
	int x1 = -1;
	int y1 = -1;
	int x2 = 2;
	int y2 = 2;
	int x3 = 4;
	int y3 = 4;

	if (x1 / y1 == x2 / y2 || x1 / y1 == x3 / y3) {
	    System.out.println("Точки А(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ") расположены на одной прямой.");
	} else {
	    System.out.println("Точки А(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ") расположены не на одной прямой.");
	}
    }
}