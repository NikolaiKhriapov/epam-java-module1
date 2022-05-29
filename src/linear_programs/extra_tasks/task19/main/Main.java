package linear_programs.extra_tasks.task19.main;

/*
 * Задача 19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
 */

public class Main {

    public static void main(String[] args) {
	double a = 2.4;

	double s = (a * a * Math.sqrt(3)) / 4;
	double h = a * Math.sqrt(3) / 2;
	double rIn = a * Math.sqrt(3) / 6;
	double rOut = a * Math.sqrt(3) / 3;

	System.out.println("Площадь треугольника равна " + s);
	System.out.println("Высота равна " + h);
	System.out.println("Радиус вписанной окружности равен " + rIn);
	System.out.println("Радиус описанной окружности равен " + rOut);

    }
}