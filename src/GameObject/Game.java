package GameObject;


public class Game {

	public static final int MAX_X = 20; //static이라서 클래스 이름으로 접근가능
	public static final int MAX_Y = 10;
	
	private char map[][] = new char[MAX_Y][MAX_X];

	 private GameObject [] m = new GameObject[2];
	 
	//private Bear bear = new Bear(0, 0, 1);
	//private Fish fish = new Fish(5, 5, 2); //움직이면 2칸씩 감
	
	int state; //0 : 게임중, 1: Fish가 이김, 2: Bear가 이김(플레이어)
	
	public Game() { //필요한 초기화를 이곳에서 다 이루어지게 함
		state = 0;
		
		m[0] = new Bear(0, 0, 1);
		m[1] = new Fish(5, 5, 2);
		
		//private Bear bear = new Bear(0, 0, 1);
		//private Fish fish = new Fish(5, 5, 2);
		
		for (int y=0; y<MAX_Y; y++) {
			for(int x=0; x<MAX_X; x++) {
				map[y][x] = '-';
			}
		}
	}
	public void run() {
		System.out.println("Bear의 Fish 먹기 게임을 시작합니다!!");
		update(); //처음시작할 때 보여주기
		draw(); //처음시작할 때 보여주기
		
		while(!doesEnd()) {
			clear(); //화면 지우고 나서 시작
			//bear.move();
			//fish.move();
			
			for(GameObject e : m)
				e.move();
			
			update(); //맵에서 캐릭터들의 좌표 변동에 따라 내용값 변경
			draw(); //캐릭터 그리기
		}
		System.out.println("Bear Wins!!!");
	}
	private void clear() {
		System.out.println();
		
		for(GameObject e : m)
			map[e.getY()][e.getX()] = '-';
		//map[bear.getY()][bear.getX()] = '-'; //원래있던 자리 초기화
		//map[fish.getY()][fish.getX()] = '-';
	}
	private void update() {
		
		for(GameObject e : m)
			map[e.getY()][e.getX()] = e.getShape();
		//map[bear.getY()][bear.getX()] = bear.getShape();
		//map[fish.getY()][fish.getX()] = fish.getShape();
	}
	private void draw() {
		for (int y=0; y<MAX_Y; y++) {
			for(int x=0; x<MAX_X; x++) {
				System.out.print(map[y][x]);
			}
			System.out.println();
		}
	}
	private boolean doesEnd() {
		//if(bear.collide(fish)) {
		//	return true;
		//}
		if(m[0].collide(m[1])) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}

}
