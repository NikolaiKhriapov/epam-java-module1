package my.home.epam.module_1.linear_programs_extra.task18;

/*
 * Задача 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.
 */

public class Main {

    public static void main(String[] args) {
	double a = 2.7;

	double s = a * a;
	double sAll = s * 6;
	double v = Math.pow(a, 3);

	System.out.println("Длина ребра куба: " + a);
	System.out.println("Площадь грани равна " + s);
	System.out.println("Площадь полной поверхности равна " + sAll);
	System.out.println("Объем куба равен " + v);
    }
}