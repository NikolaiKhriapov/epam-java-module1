package my.home.epam.module_1.conditionals_extra.task16;

/*
 * Задача 16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).
 */

public class Main {

    public static void main(String[] args) {
	double ax = 0;
	double ay = 0;

	if (ax == 0 && ay != 0) {
	    System.out.println("Точка А(" + ax + ", " + ay + ") расположена на оси у.");
	} else if (ay == 0 && ax != 0) {
	    System.out.println("Точка А(" + ax + ", " + ay + ") расположена на оси x.");
	} else if (ax > 0 && ay > 0) {
	    System.out.println("Точка А(" + ax + ", " + ay + ") расположена в I координатном угле.");
	} else if (ax < 0 && ay > 0) {
	    System.out.println("Точка А(" + ax + ", " + ay + ") расположена во II координатном угле.");
	} else if (ax < 0 && ay < 0) {
	    System.out.println("Точка А(" + ax + ", " + ay + ") расположена в III координатном угле.");
	} else if (ax > 0 && ay < 0) {
	    System.out.println("Точка А(" + ax + ", " + ay + ") расположена в IV координатном угле.");
	} else if (ax == 0 && ay == 0) {
	    System.out.println("Точка А(" + ax + ", " + ay + ") расположена в начале координат.");
	}
    }
}