//실습문제 7번

package week7;

public class Seven {

	public static void main(String[] args) {
		int num[] = new int[10];
		int sum=0;
		
		System.out.print("랜덤한 정수들 : ");
		
		for(int i=0; i<num.length; i++) {
			int ran = (int)(Math.random()*10+1); //랜덤 만들기
			num[i]=ran;
			sum+=num[i];
			System.out.print(ran+" ");
		}
		System.out.println();
		System.out.println("평균은 "+(double)sum/num.length); //double형으로 바꿔줘야 실수처리됨
	}

}
