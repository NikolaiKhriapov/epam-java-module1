package my.home.epam.module_1.linear_programs_main.task05;

/*
 * Задача 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class Main {

    public static void main(String[] args) {
	int t = 3661;

	int hours = t / 3600;
	int minutes = (t - hours * 3600) / 60;
	int seconds = (t - hours * 3600) - minutes * 60;

	System.out.println("Число T: " + t);
	System.out.println("Результат: " + hours + "ч " + minutes + "мин " + seconds + "с");
    }
}