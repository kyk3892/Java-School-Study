package week3;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("변의 길이 3개를 입력하십시오.");
			int l = sc.nextInt();
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(l+m>n || m+n>l || l+n>m) {
				System.out.println("삼각형을 만들 수 있습니다.");
			}
			else {
				System.out.println("삼각형을 만들 수 없습니다.");
			}
		}

	}

}
