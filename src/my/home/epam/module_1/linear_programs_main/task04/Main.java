package my.home.epam.module_1.linear_programs_main.task04;

/*
 * Задача 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Main {

    public static void main(String[] args) {
	double r = 111.222;

	double firstPart = (int) (r / 1);
	double secondPart = (int) (r * 1000 - firstPart * 1000);
	double result = secondPart + (firstPart / 1000);

	System.out.println("Число: " + r);
	System.out.println("Результат: " + result);
    }
}