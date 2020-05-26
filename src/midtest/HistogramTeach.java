package midtest;

import java.util.Scanner;

public class HistogramTeach {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int []histogram = new int[5]; //5그룹
		int index;
		
		int age;
		int num = scanner.nextInt(); //몇 명 받을것인가
		
		for(int i=0; i<num; i++) {
			age = scanner.nextInt(); //나이 입력받는곳
			
			if(age<19) {
				index =0;
			}
			else if(age<25) {
				index =1;
			}
			else if(age<35) {
				index =2;
			}
			else if(age<45) {
				index =3;
			}
			else {
				index =4;
			}
			histogram[index]++;
		}
		
		for(int i=0; i<histogram.length; i++) {
			double percent = (histogram[i]/(double)num)*100.0;
			System.out.println("histgoram["+i+"]="+percent+"%");
		}

	}

}

