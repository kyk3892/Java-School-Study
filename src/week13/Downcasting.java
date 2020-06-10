package week13;

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String grade;
	public Student(String name) {
		super(name);
	}
}
public class Downcasting {
	public static void main(String[] args) {
		Person person = new Student("김윤희"); //업캐스팅 부분
		Student student;
		student = (Student)person; //다운캐스팅 부분
		System.out.println(student.name);
		student.grade = "A"; //오류없음
	}
}
