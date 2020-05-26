package midtest;

public class Star {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" "); //공백 갯수가 i에 따라 바뀜
			}
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

