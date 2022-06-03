package my.home.epam.module_1.conditionals_extra.task10;

/*
 * Задача 10. Составить программу, которая определит площадь какого круга меньше.
 */

public class Main {

    public static void main(String[] args) {
	double radius1 = 7;
	double radius2 = 6;

	if (radius1 < radius2) {
	    System.out.println("Площадь круга с радиусом " + radius1 + " меньше площади круга с радиусом " + radius2);
	} else if (radius1 > radius2) {
	    System.out.println("Площадь круга с радиусом " + radius2 + " меньше площади круга с радиусом " + radius1);
	} else {
	    System.out.println("Площадь круга с радиусом " + radius1 + " равна площади круга с радиусом " + radius2);
	}
    }
}