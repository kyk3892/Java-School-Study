//실습문제 8번

package week7;

import java.util.Scanner;

public class Eight {
	
	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<1 || num>100) { //입력된 수가 1~100사이가 아니면 프로그램 종료
			System.out.println("정수 1~100까지의 수를 입력하시오");
			return;
		}
		
		int array [] = new int[num]; //배열 생성
		
		for(int i=0; i<array.length; i++) {
			int ran = (int)(Math.random()*100+1); //랜덤 정수 만들기
			
			if(exists(array,i,ran)) { //같은게 있다면 원소 하나 줄이고 다시 시작
				i--;
				continue;
			}
			array[i] = ran;
		}
		
		for(int i=0; i<array.length; i++) { //10단위로 출력하기
			if(i==0) //10을 0으로 나눌수 없으므로 0은 따로 처리하기
				System.out.print(array[i]+" ");
			else {
				if(i%10==0) 
					System.out.println();
					System.out.print(array[i]+" ");
			}	
		}
	} //메인메소드 끝
	
	public static boolean exists(int[] array, int i, int ran) {
		for(int j=0; j<i; j++) {
			if(array[j]==ran) {
				return true; //같은게 있음
			}
		}
		return false; //같은게 없음
	}

}
