package my.home.epam.module_1.linear_programs_extra.task15;

/*
 * Задача 15. Написать программу, которая выводит на экран первые четыре степени числа Pi.
 */

public class Main {

    public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
	    System.out.println("Pi^" + i + " = " + Math.pow(Math.PI, i));
	}
    }
}