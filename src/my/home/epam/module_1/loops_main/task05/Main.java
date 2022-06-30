package my.home.epam.module_1.loops_main.task05;

/*
 * Задача 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: an = (1 / (2^n)) + (1 / (3^n))
 */

public class Main {

    public static void main(String[] args) {
	double e = 0.2;
	double sum = 0.0;
	double an = 0.0;
	double n = 20;

	for (int i = 0; i <= n; i++) {
	    an = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

	    if (Math.abs(an) >= e) {
		sum += an;
	    }
	}

	System.out.println("Результат: " + sum);
    }
}