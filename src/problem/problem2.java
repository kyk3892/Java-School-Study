package problem;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner box = new Scanner(System.in);
			System.out.println("첫번째 점을 입력하시오");
			int x1 = box.nextInt();
			int y1 = box.nextInt();
			System.out.println("두번째 점을 입력하시오");
			int x2 = box.nextInt();
			int y2 = box.nextInt();
			
			if((x1>=100 && x1<=200 && y1>=100 && y1<=200)||(x2<100 && x2<200 && y2>100 && y2<=200)) {
				System.out.println("(100,100),(200,200)의 두 점으로 이루어진 직사각형과 충돌합니다.");
			}
			else {
				System.out.println("("+x1+","+y1+"),("+x2+","+y2+")의 두 점으로 이루어진 직사각형은 충돌하지 않습니다.");
			}
		}
	}
}
