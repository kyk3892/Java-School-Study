package exception;

import java.util.Scanner;

public class alpha {

	public static void main(String[] args) {
		System.out.print("(입력) ");
		Scanner scanner = new Scanner(System.in);
		String abc = scanner.nextLine();
		char change[] = new char[abc.length()];
		int i=0;
		System.out.print("(출력) ");
		for(i=0; i<abc.length(); i++) {
			change[i] = abc.charAt(i);
			if(97<=change[i] && change[i]<=122) {
				change[i]-=32;
			}
			System.out.print(change[i]);
		}	
	}

}

