package week6;

public class six {

	public static void main(String[] args) {
		int a = 10;
		int b= 20;
		int c = sum(a,b);
		System.out.println("a : "+a+" b : "+b+" c : "+c);
	}

	public static int sum(int a, int b) { //이름만 똑같고 위에 있는 a와 b와 다름
		int c = a+b;
		a=0;
		b=0;
		return c; //리턴하면 값 사라짐
	}

}
