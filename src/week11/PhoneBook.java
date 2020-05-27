package week11;

import java.util.Scanner;

public class PhoneBook {
	//멤버변수는 클래스 안에서 전역변수이다.
	static Phone[] phoneList;
	
	static String search(String name) {
		String tel = null; //아무것도 없을 때
		for(int i=0; i<phoneList.length; i++) {
			if(name.equals(phoneList[i].name)) {
				return phoneList[i].tel;
			}
		}
		return tel;
	}
	
	public static void main(String[] args) {
		//입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수를 입력하십시오>>");
		
		int n = sc.nextInt(); //인원수
		phoneList = new Phone[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("이름을 입력해주십시오>>");
			String name = sc.next();
			System.out.print("전화번호를 입력해주십시오>>");
			String tel = sc.next();
			phoneList[i] = new Phone(name, tel);
		}
		System.out.println("\nPhone List");
		
		for(Phone e : phoneList) {
			e.print();
		}
		//검색하기
		while(true) {
			System.out.print("검색 할 이름>>");
			String name = sc.next();
			if(name.equals("그만")) { //name은 string객체, 래퍼런스가 있는 위치
				break;
			}
			String tel = search(name);
			if(tel == null) { //검색된게 없음
				System.out.println(name+"이 없습니다.");
			}
			else {
				System.out.println(name+"의 전화번호는 "+tel+" 입니다.");
			}
		}
		
	}


}
