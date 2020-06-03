package week12;

import java.util.Scanner;

public class CircleManager {

	public static void main(String[] args) {
		double max=0;
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		scanner.close();
		for(int i=0; i<c.length; i++) {
			if(max<c[i].CircleArea()) {
				max = c[i].CircleArea();
			}
		}
		for(int i=0; i<c.length; i++) {
			if(max==c[i].CircleArea()) {
				System.out.print("가장 면적이 큰 원은 ");
				c[i].show();
			}
		}
	}

}
