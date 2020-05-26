package week7; //예제 3-12 메소드안에 매개변수 넘겨주기 응용문제
public class Two {
	
	public static void main(String[] args) { //static에서 부르는 모든 메소드는 똑같은 static 붙여주기
		int intArray[];
		intArray = makeArray(7);
		
		printArray(intArray); //밑에 for문 돌리는거 말고 printArray메소드 호출해서 하는 방법
		
		/*for (int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");*/
		}
	
	
	static int[]  makeArray(int n){
		int temp[] = new int[n];
		
		for (int i=0; i<temp.length; i++) {
			int number = (int)(Math.random()*10)+1; //0~0.999999이므로 *10하고 int하면 반내림되니까 +1 해줌
			temp[i] = number; //이거 안넣어주면 계속 0만 나옴
			}
		return temp;
	}
	
	
	public static void printArray(int[] arr) { //매개변수
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) { //맨마지막을 제외하고 쉼표붙이기
				System.out.print(",");
			}
		}
		System.out.println("]");

	}

}
