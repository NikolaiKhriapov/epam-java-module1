package my.home.epam.module_1.linear_programs_extra.task09;

/*
 * Задача 9. Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class Main {

    public static void main(String[] args) {
	double a = 2.0;
	double b = 2.0;
	double c = 2.0;
	double d = 2.0;

	double result = (a / c) * (b / d) - ((a * b - c) / (c * d));

	System.out.println("Значение выражения: " + result);
    }
}