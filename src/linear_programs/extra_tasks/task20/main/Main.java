package linear_programs.extra_tasks.task20.main;

/*
 * Задача 20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
 */

public class Main {

    public static void main(String[] args) {
	double length = 6.29;

	double r = length / (2 * Math.PI);
	double s = Math.PI * r * r;

	System.out.println("Для круга с R = " + r + " длина окружности равна " + length + ", площадь круга равна " + s);
    }
}