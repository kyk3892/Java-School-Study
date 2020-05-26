package week4;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		System.out.println("1에서 몇 까지 더하실 것 입니까?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = 0;
		for(int a=1; a<=n; a++) {
			b += a;
			System.out.print(a);
			if(a<=n-1) {
				System.out.print("+");
			}
			else {
				System.out.print("\n=");
				System.out.print(b);
			}
		}
		
	}

}
