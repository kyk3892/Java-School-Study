package problem;

import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("연산");
			Scanner sc = new Scanner(System.in);
			
			double num1 = sc.nextDouble();
			String operator =sc.next();
			double num2 = sc.nextDouble();
			
			if(operator.equals("+")) {
				System.out.println(num1+operator+num2+"의 계산결과는 "+(num1+num2));
			}
			else if(operator.equals("-")) {
				System.out.println(num1+operator+num2+"의 계산결과는 "+(num1-num2));
			}
			else if(operator.equals("*")) {
				System.out.println(num1+operator+num2+"의 계산결과는 "+(num1*num2));
			}
			else if(operator.equals("/")) {
				if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else {
				System.out.println(num1+operator+num2+"의 계산결과는 "+(num1/num2));
				}
			}
		}	

	}

}
