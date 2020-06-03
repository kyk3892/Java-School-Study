package week12;

class ArrayUtil {
	public static int [] concat(int[] a,int[] b) { //배열 a와 배열b를 연결한 새로운 배열 리턴
		int array[] = new int[a.length + b.length]; //배열 a와 b의 원소 갯수만큼 필요
		for(int i=0; i<a.length; i++) { 
			array[i] = a[i]; 
		}
		//배열 a 뒷부분부터 b를 넣어야하므로
		for(int i=a.length; i<a.length + b.length; i++) { 
			array[i] = b[i-a.length];
		} //b[], a[]뒤에 넣기
		return array;
	}
	public static void print(int[] a) { //배열 a출력
		System.out.print("[");
		for(int i=0; i<a.length; i++) { 
			System.out.print(" "+a[i]+" "); 
		}
		System.out.print("]");
	}
}
