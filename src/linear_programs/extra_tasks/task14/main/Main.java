package linear_programs.extra_tasks.task14.main;

/*
 * Задача 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
 */

public class Main {

    public static void main(String[] args) {
	double r = 2.2;

	double l = 2 * Math.PI * r;
	double s = Math.PI * Math.pow(r, 2);

	System.out.println("Для круга с R = " + r + " длина окружности равна " + l + ", площадь круга равна " + s);
    }
}