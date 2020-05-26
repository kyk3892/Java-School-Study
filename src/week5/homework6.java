package week5; //예제 3-7 약간의 응용

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int leng =5;
		int n[] = new int[leng];
		int max=0;
		System.out.println("양수 "+leng+"개 입력하세요.");
		for(int i=0; i<leng; i++) {
			n[i] = scanner.nextInt();
			if(n[i]>max) {
				max = n[i];
			}
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
	}

}
