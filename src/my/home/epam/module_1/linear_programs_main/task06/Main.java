package my.home.epam.module_1.linear_programs_main.task06;

/*
 * Задача 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у) 
 * принадлежит закрашенной области, и false — в противном случае.
 */

public class Main {

    public static void main(String[] args) {
	int x = -4;
	int y = -2;

	System.out.println("A(" + x + "," + y + ")");

	if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
	    System.out.println("true");
	} else {
	    System.out.println("false");
	}
    }
}