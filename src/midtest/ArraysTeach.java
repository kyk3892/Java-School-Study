package midtest;

import java.util.Arrays;

public class ArraysTeach {

	public static void main(String[] args) {
		int n=345;
		int[] result = reverse(n);
		System.out.println(Arrays.toString(result));
	}

	static int[] reverse(int n) {
		int[] revNum;
		int originalNum =n;
		int size;
		int cnt=0;
		do {
			cnt++; //사이즈
			n =n/10; //사이즈 계산
		}while(n!=0);
		
		size=cnt;
		revNum = new int[size];
		
		n = originalNum;
		for(int i=0; i<size; i++) {
			int num = n%10; //거꾸로 들어가는거
			revNum[i] = num;
			n=n/10;
		}
		return revNum;
	}

}

