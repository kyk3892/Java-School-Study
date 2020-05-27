package week11;

public class Phone {
	// 하나의 데이터가 가지고 있는 정보들 - 데이터 모델
	//멤버 변수
	String name;
	String tel; //틀 만들기
	
	//생성자 
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void print() {
		System.out.println("이름 : "+name+" 전화번호 : "+tel);
	}
	
}
