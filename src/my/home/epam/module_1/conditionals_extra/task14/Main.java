package my.home.epam.module_1.conditionals_extra.task14;

/*
 * Задача 14. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Main {

    public static void main(String[] args) {
	double angle1 = 30;
	double angle2 = 60;

	if (angle1 + angle2 < 180) {
	    System.out.println("Треугольник с углами " + angle1 + "* и " + angle2 + "* существует.");

	    if ((angle1 + angle2 == 90) || (angle1 == 90) || (angle2 == 90)) {
		System.out.println("Треугольник является прямоугольным.");
	    } else {
		System.out.println("Треугольник не является прямоугольным.");
	    }
	} else {
	    System.out.println("Треугольник с углами " + angle1 + "* и " + angle2 + "* не существует.");
	}
    }
}