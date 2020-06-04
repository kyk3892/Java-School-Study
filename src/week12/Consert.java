package week12;

import java.util.Scanner;

public class Consert {
	static Scanner sc = new Scanner(System.in);
	static Seat sseat = new Seat();
	static Seat aseat = new Seat();
	static Seat bseat = new Seat();
	
	public static void reservation() {
		System.out.print("좌석구분 S(1), A(2), B(3) >>");
		int abs = sc.nextInt();
		if(abs==1) {
			System.out.print("S>>");
			sseat.print();
			System.out.print("\n이름>>");
			String human = sc.next();
			System.out.print("번호(1~10)>>");
			int seatnum = sc.nextInt();
			if(1<=seatnum && seatnum<=10) {
				sseat.name[seatnum-1] = human;
				System.out.println("S좌석에 예약이 완료되었습니다.");
			}
			else {
				System.out.println("번호 1~10자리 중에서 선택해주세요");
			}
		}
		else if(abs==2) {
			System.out.print("A>>");
			aseat.print();
			System.out.print("\n이름>>");
			String human = sc.next();
			System.out.print("번호(1~10)>>");
			int seatnum = sc.nextInt();
			if(1<=seatnum && seatnum<=10) {
				aseat.name[seatnum-1] = human;
				System.out.println("A좌석에 예약이 완료되었습니다.");
			}
			else {
				System.out.println("번호 1~10자리 중에서 선택해주세요");
			}
		}
		else if(abs==3) {
			System.out.print("B>>");
			bseat.print();
			System.out.print("\n이름>>");
			String human = sc.next();
			System.out.print("번호(1~10)>>");
			int seatnum = sc.nextInt();
			if(1<=seatnum && seatnum<=10) {
				bseat.name[seatnum-1] = human;
				System.out.println("B좌석에 예약이 완료되었습니다.");
			}
			else {
				System.out.println("번호 1~10자리 중에서 선택해주세요");
			}
		}
		else {
			System.out.println("좌석 1,2,3번 중 골라주세요");
		}
	}
	public static void lookup() {
		System.out.print("S>>");
		sseat.print();
		System.out.print("\nA>>");
		aseat.print();
		System.out.print("\nB>>");
		bseat.print();
		System.out.println("\n<<조회를 완료하였습니다.>>");
	}
	public static void cancel() {
		System.out.print("좌석 S : 1, A : 2, B : 3>>");
		int abs = sc.nextInt();
		if(abs==1) {
			System.out.print("S>>");
			sseat.print();
			System.out.print("\n이름>>");
			String human = sc.next();
			for(int i=0; i<sseat.name.length; i++) {
				if(sseat.name[i].equals(human)) {
					sseat.name[i] = "---";
					System.out.println("취소가 완료되었습니다.");
				}
			}
		}
		else if(abs==2) {
			System.out.print("A>>");
			aseat.print();
			System.out.print("\n이름>>");
			String human = sc.next();
			for(int i=0; i<aseat.name.length; i++) {
				if(aseat.name[i].equals(human)) {
					aseat.name[i] = "---";
					System.out.println("취소가 완료되었습니다.");
				}
			}
		}
		else if(abs==3) {
			System.out.print("B>>");
			bseat.print();
			System.out.print("\n이름>>");
			String human = sc.next();
			for(int i=0; i<bseat.name.length; i++) {
				if(bseat.name[i].equals(human)) {
					bseat.name[i] = "---";
					System.out.println("취소가 완료되었습니다.");
				}
			}
		}
		else {
			System.out.println("좌석 1,2,3번 중에서 골라주세요.");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {
			System.out.print("\n예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >>");
			sc = new Scanner(System.in);
			int system = sc.nextInt();
			if(system==1) { reservation(); }
			else if(system==2) { lookup(); }
			else if(system==3) { cancel(); }
			else if(system==4) { 
				System.out.println("프로그램이 종료됩니다.");
				break; 
			}
			else { System.out.println("예약, 조회, 취소, 끝내기 중에서 골라주세요."); }
		}
	}
}
