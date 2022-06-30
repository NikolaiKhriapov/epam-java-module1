package my.home.epam.module_1.linear_programs_extra.task06;

/*
 * Задача 6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших бидонах, 
 * если в каждом большом бидоне на 12 л больше, чем в малом?
 */

public class Main {

    public static void main(String[] args) {
	int n = 4;
	int m = 2;
	double milkSmallTotalVolume = 80;
	double smallBottleVolume;
	double bigBottleVolume;

	smallBottleVolume = milkSmallTotalVolume / n;
	bigBottleVolume = smallBottleVolume + 12;
	double milkBigTotalVolume = bigBottleVolume * m;

	System.out.println("При n = " + n + ", m = " + m + " в m больших бидонах " + milkBigTotalVolume + " л молока.");
    }
}