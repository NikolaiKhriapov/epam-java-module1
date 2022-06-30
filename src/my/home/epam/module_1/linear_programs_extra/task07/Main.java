package my.home.epam.module_1.linear_programs_extra.task07;

/*
 * Задача 7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника.
 */

public class Main {

    public static void main(String[] args) {
	double length = 5.0;
	double width = length / 2;

	double area = length * width;

	System.out.println("При длине = " + length + " ширина = " + width + " и площадь прямоугольника = " + area + ".");
    }
}