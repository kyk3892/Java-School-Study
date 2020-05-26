package week5; //예제 3-6

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		System.out.println("exit를 입력하면 종료합니다");
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit")) {
				break;
			}	
		}
		System.out.println("종료합니다...");
		scanner.close();
	}
}
