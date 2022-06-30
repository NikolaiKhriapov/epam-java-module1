package my.home.epam.module_1.linear_programs_extra.task03;

/*
 * Задача 3. Найдите значение функции: z = 2 * x + (y - 2) * 5.
 */

public class Main {

    public static void main(String[] args) {
	double x = 1.5;
	double y = 2.5;

	double z = 2 * x + (y - 2) * 5;
	System.out.println("При x = " + x + " и y = " + y + " значение функции z = " + z);
    }
}