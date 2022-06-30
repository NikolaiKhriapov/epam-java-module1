package my.home.epam.module_1.conditionals_extra.task03;

/*
 * Задача 3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», 
 * если число а меньше 3; если больше, то вывести слово «no».
 */

public class Main {

    public static void main(String[] args) {
	int a = 7;
	int number3 = 3;

	System.out.println("Число a: " + a);

	if (a < number3) {
	    System.out.println("Результат: yes");
	} else if (a > number3) {
	    System.out.println("Результат: no");
	} else {
	    System.out.println("Ошибка! Числа равны.");
	}
    }
}