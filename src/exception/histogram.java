package exception;

import java.util.Scanner;

public class histogram {

	public static void main(String[] args) {
		System.out.println("몇 명을 입력하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i,j = 0;
		int count[]=new int[5]; //연령대별
		double percent[]=new double[5]; //연령대별
		int age[] = new int[num]; //몇 명인지
		for(i=0; i<num; i++) {
			age[i]=sc.nextInt();
			if(age[i]<=18) {
				count[0]+=1;
				percent[0]=(100/num)*count[0];
			}
			if(19<=age[i] && age[i]<=24) {
				count[1]+=1;
				percent[1]=(100/num)*count[1];
			}
			if(25<=age[i] && age[i]<=34) {
				count[2]+=1;
				percent[2]=(100/num)*count[2];
			}
			if(35<=age[i] && age[i]<=44) {
				count[3]+=1;
				percent[3]=(100/num)*count[3];
			}
			if(45<=age[i]) {
				count[4]+=1;
				percent[4]=(100/num)*count[4];
			}
		}
		for(j=0; j<5; j++) {
			System.out.println("histogram["+j+"]="+percent[j]+"%");
		}
		
	}

}

