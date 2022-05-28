package conditionals.extra_tasks.task02.main;

/*
 * Задача 2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no».
 */

public class Main {

    public static void main(String[] args) {
	int number1 = 4;
	int number2 = 5;

	System.out.println("Число 1: " + number1);
	System.out.println("Число 2: " + number2);
	System.out.print("Результат: ");

	if (number1 < number2) {
	    System.out.println("yes");
	} else {
	    System.out.println("no");
	}
    }
}