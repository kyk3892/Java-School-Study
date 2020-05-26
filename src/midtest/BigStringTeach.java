package midtest;

import java.util.Scanner;

public class BigStringTeach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		for(int i=0; i<line.length(); i++) {
			char change = line.charAt(i);
			char big;
			if(change>='a' && change<='z') { //소문자일때
				big = (char)(change-('a'-'A')); //숫자로하면 32차이 같은말
			}
			else big = change; //대문자이면 그냥 넘어가라
			System.out.print(big);
		}

	}

}

