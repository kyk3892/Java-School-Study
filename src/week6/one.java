package week6; //예제 3-8

import java.util.Scanner;

public class one {
			
	public static void main(String[] args) {
		int intArray[] = new int[7];
		int sum =0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(intArray.length+"개의 정수를 입력하시오>> ");
		
		for(int i=0; i<intArray.length; i++)
			intArray[i] = scanner.nextInt();
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i];
		
		System.out.println("평균은 "+(double)sum/intArray.length);
		scanner.close();
	}

}
