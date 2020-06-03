package week12;

import java.util.Scanner;

public class DicApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			String kor = sc.next();
			if(kor.equals("그만")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
			String eng = Dictionary.kor2Eng(kor);
			if(eng == null) {
				System.out.println(kor+"은(는) 저의 사전에 없습니다.");
			}
			else {
				System.out.println(kor+"은(는) "+eng);
			}
		}

	}

}
