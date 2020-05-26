package exception;

import java.util.Scanner;

public class milekg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double mile,km;
		final double KM_PER_MILE = 1.609;
		mile = scanner.nextDouble();
		km = mile*KM_PER_MILE;
		System.out.println("km : "+km);

	}

}

