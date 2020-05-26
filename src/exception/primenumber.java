package exception;

public class primenumber {

	public static void main(String[] args) {
		System.out.println("소수를 찾아라!");
		int i,j;
		for(i=2; i<=100; i++) {
			for(j=2; j<=i; j++) {
				if(i%j==0 && i!=j) {
					break;
				}
				if(i==j) {
					System.out.print(i+" ");	
				}
			}
		}
	}

}

