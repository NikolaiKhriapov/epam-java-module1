package my.home.epam.module_1.loops_extra.task20;

/*
 * Задача 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: an = 1 / ((3*n - 2) * (3*n + 1)).
 */

public class Main {

    public static void main(String[] args) {
	double e = 0.2;
	double sum = 0.0;
	double an = 0.0;
	double n = 20;

	for (int i = 0; i <= n; i++) {
	    an = 1.0 / ((3 * i - 2) * (3 * i + 1));

	    if (Math.abs(an) >= e) {
		sum += an;
	    }
	}

	System.out.println("Результат: " + sum);
    }
}