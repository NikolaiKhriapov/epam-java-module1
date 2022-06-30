package my.home.epam.module_1.linear_programs_extra.task13;

/*
 * Задача 13. Заданы координаты трех вершин треугольника (х1,у1),(х2,у2),(х3,у3). Найти его периметр и площадь.
 */

public class Main {

    public static void main(String[] args) {
	double x1 = -1.0;
	double y1 = -1.0;
	double x2 = 1.0;
	double y2 = 2.0;
	double x3 = 2.0;
	double y3 = 1.0;

	double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
	double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

	double p = a + b + c;
	double pHalf = p / 2.0;
	double s = Math.sqrt(pHalf * (pHalf - a) * (pHalf - b) * (pHalf - c));

	System.out.println("Периметр треугольника P = " + p);
	System.out.println("Площадь треугольника S = " + s);
    }
}