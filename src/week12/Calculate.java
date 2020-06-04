package week12;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("두 정수와 연산자를 입력하시오>>");
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			String cal = sc.next();
			switch(cal) {
			case "+":
				Add add = new Add();
				add.setValue(num, num2);
				System.out.println(add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(num, num2);
				System.out.println(sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(num, num2);
				System.out.println(mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(num, num2);
				System.out.println(div.calculate());
				break;
			}
		}

	}

}
