import java.util.Scanner;

public class Controller {
	int id,grade = 0;
	String name,major = null;
	Scanner sc = new Scanner(System.in);
	Student student = new Student(id, grade, name, major);
	

	void display() {
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 모든학생 출력");
		System.out.println("5. 종료");

	}
	void count (){
		System.out.println("변경하실 목록을 선택하세요");
		System.out.println("1. garde");
		System.out.println("2. name");
		System.out.println("3. major");
	}


}
