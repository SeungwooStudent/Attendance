import java.util.LinkedList;
import java.util.Scanner;

public class Student {
	int id; // 학번
	int grade; // 학년
	String name; // 이름
	String major; // 전공
	Scanner sc;
	int delete = 0;
//	int choice;

	LinkedList<Student> students = new LinkedList<>();
//	final Controller controller = new Controller();

	Student(int id, String name) {
		this.id = id;
		this.name = name;
		grade = 4;
		major = "computer";
	}

	Student(int id, int grade, String name, String major) {
		this.id = id;
		this.grade = grade;
		this.name = name;
		this.major = major;
	}

	void introduceMyself() {
		System.out.println("=============");
		System.out.println("id : " + id);
		System.out.println("grade : " + grade);
		System.out.println("name : " + name);
		System.out.println("major : " + major);
		System.out.println("=============");
	}

	void noneId(boolean isFind) {
		if (!isFind) {
			System.out.println("없는 아이디입니다 다시 시도해주세요");
			System.out.println();
		}
	}

//	public void StudentfindId() {
//		for (int i = 0; i < students.size(); i++) {
//			Student std = students.get(i);
//			
//			if (delete == std.id) {
//				students.remove(i);
//				System.out.println("삭제되었습니다");
//				break;
//
//			}
//		}
//	}

}
