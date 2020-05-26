package week10;

public class CircleApp {

	public static void main(String[] args) {
		CircleTeach pizza; //Circle 참조변수인 pizza 선언
		pizza = new CircleTeach(10,"자바피자"); //생성
		//pizza.radius = 10; //객체 접근하기 위해서 .필요
		//pizza.name = "자바피자";
		pizza.print();
		
		CircleTeach donut = new CircleTeach(2, "자바도넛");
		//donut.radius = 2;
		//donut.name = "자바도넛";
		donut.print();

	}

}
