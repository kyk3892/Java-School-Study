package midtest;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int i=2; i<=100; i++) {
			int j=2;
			for(j=2; j<=i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(j==i) {
				System.out.println(i+"는 소수");
			}
		}

	}

}

