package GameObject;


public class Fish extends GameObject {

	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@Override
	protected void move() {
		int n = (int)(Math.random()*5);
		
		if(n==0) x += distance;
		else if(n==1) x -= distance; //5개 중에 3개는 아무것도 안함
		
		//x, y는 이차원 배열에서의 인덱스 값이므로 꼭 조사해서 재조어해야 함
		if(x < 0) x = 0;
		if(x >= Game.MAX_X) x = Game.MAX_X -1;
		
		if(n==0) y += distance;
		else if(n==1) y -= distance; //5개 중에 3개는 아무것도 안함
		
		//x, y는 이차원 배열에서의 인덱스 값이므로 꼭 조사해서 재조어해야 함
		if(y < 0) y = 0;
		if(y >= Game.MAX_Y) y = Game.MAX_Y -1;
		
	}

	@Override
	protected char getShape() {
		return '@';
	}

}
