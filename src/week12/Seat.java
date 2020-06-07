package week12;

class Seat{
	//static String name[]을 하면 공기처럼 모두 공유하는 것이기 때문에
	//등급별로 달라야 하므로 static있으면 안됨
	String name[] = {"---","---","---","---","---","---","---","---","---","---"};	
	public void print() {
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
	}
	
}
