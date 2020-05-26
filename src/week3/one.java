package week3;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하십시오.");
		int age = scanner.nextInt();
			if((10<=age) && (20>age)) {
				System.out.println("10대");
			}
			else if((20<=age) && (30>age)) {
				System.out.println("20대");
			}
			else if((30<=age) && (40>age)) {
				System.out.println("30대");
			}
			else if((40<=age) && (50>age)) {
				System.out.println("40대");
			}
			else if((50<=age) && (60>age)) {
				System.out.println("50대");
			}
			else if((60<=age) && (70>age)) {
				System.out.println("60대");
			}
			else {
				System.out.println("다시 입력해주십시오.");
			}
		}
	}

}
