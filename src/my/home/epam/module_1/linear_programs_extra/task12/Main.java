package my.home.epam.module_1.linear_programs_extra.task12;

/*
 * Задача 12. Вычислить расстояние между двумя точками с данными координатами (х1,у1) и (x2,у2).
 */

public class Main {

    public static void main(String[] args) {
	double x1 = 1.0;
	double y1 = 1.0;
	double x2 = -1.0;
	double y2 = -1.0;

	double result = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));

	System.out.println("Расстояние между точками (" + x1 + ", " + y1 + ") и (" + x2 + ", " + y2 + ") равно " + result);
    }
}