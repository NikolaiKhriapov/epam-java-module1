package my.home.epam.module_1.linear_programs_extra.task17;

/*
 * Задача 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
 */

public class Main {

    public static void main(String[] args) {
	double number1 = 2.4;
	double number2 = -5.8;

	double avgArithmetic = (Math.pow(number1, 3) + Math.pow(number2, 3)) / 2;
	double avgGeometric = Math.sqrt(Math.abs(number1) * Math.abs(number2));

	System.out.println("Среднее арифметическое кубов чисел " + number1 + " и " + number2 + " равно " + avgArithmetic);
	System.out.println("Среднее геометрическое модулей чисел " + number1 + " и " + number2 + " равно " + avgGeometric);
    }
}