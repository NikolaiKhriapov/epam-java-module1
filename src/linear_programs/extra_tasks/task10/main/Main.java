package linear_programs.extra_tasks.task10.main;

/*
 * Задача 10. Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

public class Main {

    public static void main(String[] args) {
	double x = 60;
	double y = 60;

	double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y));

	System.out.println("Значение выражения: " + result);

    }
}