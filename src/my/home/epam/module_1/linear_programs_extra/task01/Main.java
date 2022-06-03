package my.home.epam.module_1.linear_programs_extra.task01;

/*
 * Задача 1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.
 */

public class Main {

    public static void main(String[] args) {
	double x = 1.3;
	double y = 3.5;

	double sum = x + y;
	System.out.println("Сумма чисел " + x + " и " + y + " равна " + sum);

	double difference = x - y;
	System.out.println("Разность чисел " + x + " и " + y + " равна " + difference);

	double composition = x * y;
	System.out.println("Произведение чисел " + x + " и " + y + " равно " + composition);

	double quotient = x / y;
	System.out.println("Частное чисел " + x + " и " + y + " равно " + quotient);
    }
}