package problem;

import java.util.Scanner;

public class problem3 {

	public static void main(String[] args) {
		
		while(true) {
			
			Scanner in = new Scanner(System.in);
			System.out.println("첫번째 원의 중심과 반지름 입력");
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int radius1 = in.nextInt();
			System.out.println("두번째 원의 중심과 반지름 입력");
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			int radius2 = in.nextInt();
			
			if(Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))>radius1+radius2) {
				System.out.println("두 원은 서로 겹치지 않는다.");
			}
			else if(Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))<=radius1+radius2) {
				System.out.println("두 원은 서로 겹친다.");
			}
		}
	}
}
