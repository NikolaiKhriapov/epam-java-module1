package linear_programs.extra_tasks.task11.main;

/*
 * Задача 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
 */

public class Main {

    public static void main(String[] args) {
	double a = 1.1;
	double b = 2.2;

	double perimeter = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
	double area = (a * b) / 2;

	System.out.println("Прямоугольный треугольник с катетами a = " + a + " и b = " + b);
	System.out.println("Площадь треугольника P = " + perimeter);
	System.out.println("Периметр треугольника S = " + area);
    }
}