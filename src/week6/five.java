package week6; //예제 3-10 1학기 평점내기

public class five {

	public static void main(String[] args) {
		
		double score[][] = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		double sum =0;
		
		for(int year=0; year<score.length; year++) {
			for(int term =0; term<1; term++) 
				sum += score[year][term];
		}
		int n = score.length;
		System.out.println("1~4학년 1학기 평점 평균은 "+sum/n);

	}

}
