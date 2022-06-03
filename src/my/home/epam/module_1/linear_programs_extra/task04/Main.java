package my.home.epam.module_1.linear_programs_extra.task04;

/*
 * Задача 4. Найдите значение функции:  z = ((a – 3) * b / 2) + c.
 */

public class Main {

    public static void main(String[] args) {
	double a = 1.5;
	double b = 2.5;
	double c = 3.5;

	double z = ((a - 3.0) * b / 2.0) + c;

	System.out.println("При a = " + a + ", b = " + b + " и c = " + c + " значение фунции z = " + z);
    }
}