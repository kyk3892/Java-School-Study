package week6; //예제 3-12

public class Seven {

	static int[]  makeArray(){
		int temp[] = new int[5];
		for (int i=0; i<temp.length; i++)
			temp[i] = i;
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		for (int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

}
