//문제 3-1 다음 수식들의 n항까지의 값을 계산하여 출력하는 프로그램을 작성하시오. 

package week7;

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		System.out.print("∑(시그마) 1에서 n까지 (3n-2)를 구할때,몇 n까지 계산하시겠습니까?");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum=0;
		
		
		for(int n=1; n<=num; n++) {
			sum +=(3*n-2);
		}
		System.out.print(sum);

	}

}
