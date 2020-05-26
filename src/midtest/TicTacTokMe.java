package midtest;

import java.util.Scanner;

public class TicTacTokMe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TicTacToe Game을 시작합니다! \n");
		//상수 선언
		final char BLANK = ' ';
		final char COMPUTER = 'O';
		final char PLAYER = 'X';
		
		char[][] board = new char[3][3];
		int x,y; //사용자가 입력한 자리
		
		//보드 초기화 - 보드 칸에 일단 빈칸을 넣겠다
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = BLANK;
			}
		}
		do {
			//보드 선 출력
			for(int i=0; i<3; i++) {
				System.out.println(" "+board[i][0]+" | "+board[i][1]+" | "+board[i][2]);
				if(i!=2) {
					System.out.println("---|---|---");
				}
			}
			
			//게임 유저의 입력을 받는 부분
			System.out.println();
			System.out.print("다음 수의 좌표를 입력하시오:");
			x = sc.nextInt();
			y = sc.nextInt();
			//예외 처리부분
			try{
				if(board[x][y]!=BLANK || x<0 || x>2 || y<0 || y>2) { //x와 y 값 0,1,2
				}
				else {
					board[x][y] = PLAYER;
					checkWin(board,PLAYER,x,y);
				}
			}
			catch(ArrayIndexOutOfBoundsException a){
				System.out.println("\n 잘못된 위치입니다.다시 입력해주세요 \n");
				continue; //잘못된 위치이므로 값을 다시 받아야 함
			}
			//컴퓨터가 놓을 자리를 찾아서 'O'으로 넣어준다.
			int i=0, j=0;
			boolean found = false; //초기값은 false임 빠져나가게 하기위해
			for(i=0; i<3 && found == false; i++) {
				for(j=0; j<3; j++) {
					if(board[i][j] == BLANK) {
						board[i][j] = COMPUTER; //빈자리에 컴퓨터가 O를 넣겠다
						found = true; //값을 넣으면 true로 바꿈 위위에 for문 빠져나가기 위해
						checkWin(board,COMPUTER,i,j);
						break;
					}
				}
			}
		}while(true);
	}
	
	public static boolean checkWin(char board[][],int who, int i, int j) { //board오류 막기위해
		boolean result = false;
			if((board[i][0] == who && board[i][1] == who && board[i][2] == who)||
			   (board[0][j] == who && board[1][j] == who && board[2][j] == who)||
			   (board[0][0] == who && board[1][1] == who && board[2][2] == who)||
			   (board[0][2] == who && board[1][1] == who && board[2][0] == who)) {
				if(who=='O') {
					System.out.println("\n 컴퓨터가 이겼습니다!! \n");
				}
				else if(who=='X') {
					System.out.println("\n 플레이어가 이겼습니다!! \n");
				}
				result = true;
			}
			else {
				result = false;
			}
			return result;
	}
}

