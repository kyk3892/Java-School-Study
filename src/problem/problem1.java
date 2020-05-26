package problem;

import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1~99 사이의 정수를 입력하시오");
			int num = scanner.nextInt();
			if(num>=1 && num<=99) {
				if(num/10 == 3 || num/10 == 6 || num/10 == 9) {
					if(num%10 == 3 || num%10 == 6 || num%10 == 9) {
					System.out.println("박수짝짝");
					}
					else {
						System.out.println("박수짝");
					}
				}
				else if (num%10 == 3 || num%10 == 6 || num%10 == 9) {
					System.out.println("박수짝");
				}
			}	
			else {
				System.out.println("1~99 사이의 정수가 아닙니다. 다시 입력해주십시오");
			}
		}
	}
}
