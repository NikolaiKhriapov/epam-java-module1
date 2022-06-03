package my.home.epam.module_1.conditionals_extra.task11;

/*
 * Задача 11. Составить программу, которая определит площадь какого треугольника больше.
 */

public class Main {

    public static void main(String[] args) {
	int a1 = 4;
	int b1 = 4;
	int c1 = 4;

	int a2 = 6;
	int b2 = 6;
	int c2 = 6;

	int p1 = (a1 + b1 + c1) / 2;
	int p2 = (a2 + b2 + c2) / 2;

	double s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
	double s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

	if (s1 > s2) {
	    System.out.println("Площадь треугольника со сторонами " + a1 + ", " + b1 + ", " + c1 + " больше площади треугольника со сторонами " + a2 + ", " + b2 + ", " + c2);
	} else if (s2 > s1) {
	    System.out.println("Площадь треугольника со сторонами " + a2 + ", " + b2 + ", " + c2 + " больше площади треугольника со сторонами " + a1 + ", " + b1 + ", " + c1);
	} else {
	    System.out.println("Площадь треугольника со сторонами " + a2 + ", " + b2 + ", " + c2 + " равна площади треугольника со сторонами " + a1 + ", " + b1 + ", " + c1);
	}
    }
}