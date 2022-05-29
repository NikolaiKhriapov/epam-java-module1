package loops.extra_tasks.task18.main;

/*
 * Задача 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: an = ((-1)^(n-1))/n.
 */

public class Main {

    public static void main(String[] args) {
	double e = 0.2;
	double sum = 0.0;
	double an = 0.0;
	double n = 20;

	for (int i = 2; i <= n; i++) {
	    an = Math.pow(-1, i - 1) / i;

	    if (Math.abs(an) >= e) {
		sum += an;
	    }
	}

	System.out.println("Результат: " + sum);
    }
}