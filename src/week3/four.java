package week3;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("두 자리 정수를 입력하십시오.");
			int number = sc.nextInt();
			if((10<=number) && (99>=number)) {
				if(number/10 == number%10) {
					System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
				}
				else {
					System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
				}
			}
		}

	}

}
