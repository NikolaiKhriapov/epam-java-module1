package my.home.epam.module_1.linear_programs_extra.task08;

/*
 * Задача 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class Main {

    public static void main(String[] args) {
	double a = 2.2;
	double b = 3.3;
	double c = 4.4;

	double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c + Math.pow(b, -2));

	System.out.println("Значение выражения: " + result);
    }
}