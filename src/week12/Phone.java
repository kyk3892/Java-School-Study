package week12;

public class Phone {
	// 하나의 데이터가 가지고 있는 정보들 - 데이터 모델
	//멤버 변수
	private String name;
	private String tel; //막 바꾸면 안되므로 private
	
	//생성자 
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void print() {
		System.out.println("이름 : "+name+" 전화번호 : "+tel);
	}
	public String getName() { //넘겨받은 값이 없기 때문에 return
		return this.name;
	}
	public String getTel() {
		return this.tel;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) { //메소드를 통해서 tel을 바꿀 수 있다.
		this.tel = tel;
	}
	public void run() {
		
	}
}
