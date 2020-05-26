package exception;

public class What {
	
	public static int sum(int n, int m, int l) {
		int result;
		result = n + m + l;
		return result;
	}
	 
	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		int c = 15;
		int s;
		s= sum(a, b, c);
		System.out.println("삼각형의 둘레 " + s);
	}
}

