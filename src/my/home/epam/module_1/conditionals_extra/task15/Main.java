package my.home.epam.module_1.conditionals_extra.task15;

/*
 * Задача 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих 
 * двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.
 */

public class Main {

    public static void main(String[] args) {
	double x = 2;
	double y = 3;

	System.out.println("Число x: " + x);
	System.out.println("Число y: " + y);

	System.out.print("Результат: ");

	if (x == y) {
	    System.out.println("Ошибка! Число x и у равны.");
	} else if (x < y) {
	    System.out.println("Число x: " + (x + y) / 2 + ", число y: " + (x * y) * 2);
	} else {
	    System.out.println("Число x: " + (x * y) * 2 + ", число y: " + (x + y) / 2);
	}
    }
}