package my.home.epam.module_1.conditionals_main.task04;

/*
 * Задача 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
 */

public class Main {

    public static void main(String[] args) {
	int a = 4;
	int b = 6;
	int x = 5;
	int y = 4;
	int z = 10;

	if (x <= a || x <= b) {
	    if (y <= a || y <= b || z <= a || z <= b) {
		System.out.println("Киприч размером " + x + "x" + y + "x" + z + " пройдет через отверстие размером " + a + "x" + b);
	    } else {
		System.out.println("Киприч размером " + x + "x" + y + "x" + z + " не пройдет через отверстие размером " + a + "x" + b);

	    }
	} else if ((y <= a || y <= b) && (z <= a || z <= b)) {
	    System.out.println("Киприч размером " + x + "x" + y + "x" + z + " пройдет через отверстие размером " + a + "x" + b);
	} else {
	    System.out.println("Киприч размером " + x + "x" + y + "x" + z + " не пройдет через отверстие размером " + a + "x" + b);
	}

    }
}