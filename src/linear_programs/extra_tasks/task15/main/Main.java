package linear_programs.extra_tasks.task15.main;

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