//문제 3-2 다음 수식들의 n항까지의 값을 계산하여 출력하는 프로그램을 작성하시오.

package week7;

public class Ten {

	public static void main(String[] args) {
		int sum=0;
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+"+");
				sum += j;
			}
			System.out.print(" ");
		}
		System.out.println("\n합은 : "+sum);
	}

}
