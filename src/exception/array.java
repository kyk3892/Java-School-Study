package exception;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		int n=345;
		int[]result;
		result = reverse(n);
		System.out.println(Arrays.toString(result));
	}

	private static int[] reverse(int n) {
		int len =Long.toString(n).length();
		int []result = new int[len];
		for(int i=0; i<len;i++) {
			result[i]=(int)n%10;
			n/=10;
		}
		return result;
	}

}

