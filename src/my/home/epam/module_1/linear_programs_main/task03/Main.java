package my.home.epam.module_1.linear_programs_main.task03;

/*
 * Задача 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class Main {

    public static void main(String[] args) {
	double x = 60;
	double y = 60;

	double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y));

	System.out.println("Значение выражения: " + result);
    }
}