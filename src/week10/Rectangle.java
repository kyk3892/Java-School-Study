package week10;

public class Rectangle {
	
	int x,y,width,height;
	
	public Rectangle() { //기본생성자 만들어줘야 오류가 없다
	}
	public Rectangle(int x,int y,int width,int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	public int square() {
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
		//면적은 메인메서드에서 출력
	}
	public boolean contains(Rectangle r,Rectangle t) { //r또는 s와 t값 받아오기
		boolean result = false;
		//r의 x가 t의 x와 x+width 값 사이에있고 r의 x+width도 t의 x와 x+width 사이에 있어야함
		//r의 y가 t의 y와 y+height 값 사이에있고 r의 y+height도 t의 y와 y+height 사이에 있어야함
		if(t.x<=r.x && r.x<=t.x+t.width && t.x<=r.x+r.width && r.x+r.width<=t.x+t.width
		   && t.y<=r.y && r.y<=t.y+t.height && t.y<=r.y+r.height && r.y+r.height<=t.y+t.height) {
			return true;
		}
		return result;
	}
}
