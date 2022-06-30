package my.home.epam.module_1.conditionals_extra.task04;

/*
 * Задача 4. Составить программу: равны ли два числа а и b?
 */

public class Main {

    public static void main(String[] args) {
	int a = 6;
	int b = 6;

	System.out.println("Число a: " + a);
	System.out.println("Число b: " + b);

	if (a == b) {
	    System.out.println("Числа a и b равны");
	} else {
	    System.out.println("Числа a и b не равны.");
	}
    }
}