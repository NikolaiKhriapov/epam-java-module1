package my.home.epam.module_1.loops_main.task06;

/*
 * Задача 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Main {

    public static void main(String[] args) {
	for (int i = 32; i <= 126; i++) {
	    System.out.println(i + " - " + (char) i);
	}
    }
}