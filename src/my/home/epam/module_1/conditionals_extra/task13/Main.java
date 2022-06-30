package my.home.epam.module_1.conditionals_extra.task13;

/*
 * Задача 13. Даны две точки А(х1,у1) и В(х2,у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат.
 */

public class Main {

    public static void main(String[] args) {
	double x1 = -4;
	double y1 = 6;

	double x2 = 6;
	double y2 = 4;

	double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
	double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

	if (distance1 < distance2) {
	    System.out.println("Число А(" + x1 + ", " + y1 + ") находится ближе к началу координат, чем точка В(" + x2 + ", " + y2 + ").");
	} else if (distance1 > distance2) {
	    System.out.println("Число B(" + x2 + ", " + y2 + ") находится ближе к началу координат, чем точка А(" + x1 + ", " + y1 + ").");
	} else {
	    System.out.println("Числа А(" + x1 + ", " + y1 + ") и B(" + x2 + ", " + y2 + ") находятся на одинаковом расстоянии от начала координат.");
	}
    }
}