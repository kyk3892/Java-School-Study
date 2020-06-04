package week12;

import java.util.Scanner;

class Rsystem{
	String name[] = {"---","---","---","---","---","---","---","---","---","---"};
	
	void print() {
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
	}
	void reserve(String who, int sitnum) {
		name[sitnum-1] = who;
	}
	void cancel(String who) {
		for(int i=0; i<name.length; i++) {
			if(name[i].equals(who)) {
				name[i] = "---";
				return;
			}
		}
	}
}

public class know {
	static Scanner sc = new Scanner(System.in);
	static Rsystem ssystem = new Rsystem();
	static Rsystem asystem = new Rsystem();
	static Rsystem bsystem = new Rsystem();
	public static void reserve() {
		System.out.println("좌석 구분 S1,A2,B3>>");
		int sit = sc.nextInt();
		if(sit==1) {
			System.out.print("S>>");
			ssystem.print();
			System.out.print("\n이름>>");
			String who = sc.next();
			System.out.print("번호>>");
			int sitnum = sc.nextInt();
			ssystem.reserve(who, sitnum);
		}
		else if(sit==2) {
			System.out.print("A>>");
			ssystem.print();
			System.out.print("\n이름>>");
			String who = sc.next();
			System.out.print("번호>>");
			int sitnum = sc.nextInt();
			asystem.reserve(who, sitnum);
		}
		else if(sit==3) {
			System.out.print("B>>");
			ssystem.print();
			System.out.print("\n이름>>");
			String who = sc.next();
			System.out.print("번호>>");
			int sitnum = sc.nextInt();
			bsystem.reserve(who, sitnum);
		}
		
	}
	public static void show() {
		System.out.print("s>>");
		ssystem.print();
		System.out.print("\na>>");
		asystem.print();
		System.out.print("\nb>>");
		bsystem.print();
		System.out.println("조회 끝");
	}
	public static void cancel() {
		System.out.println("좌석 구분 S1, A2,  B3>>");
		int sit = sc.nextInt();
		if(sit==1) {
			System.out.print("s>>");
			ssystem.print();
			System.out.print("\n이름>>");
			String who = sc.next();
			ssystem.cancel(who);
		}
		else if(sit==2) {
			System.out.print("a>>");
			asystem.print();
			System.out.print("\n이름>>");
			String who = sc.next();
			asystem.cancel(who);
		}
		else if(sit==3) {
			System.out.print("b>>");
			bsystem.print();
			System.out.print("\n이름>>");
			String who = sc.next();
			bsystem.cancel(who);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("명품 콘서트홀 예약 시스템");
		for(;;) {
			System.out.println("예약1, 조회2, 취소 3, 끝내기4");
			int num = sc.nextInt();
			if(num==4) {
				return;
			}
			else if(num==1) {
				reserve();
			}
			else if(num==2) {
				show();
			}
			else if(num==3) {
				cancel();
			}
		}
	}
}
