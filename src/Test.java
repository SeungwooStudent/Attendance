import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.attendance.model.Student;

public class Test {
	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> students = new HashMap<>();
		Student kim = new Student(10, "Kim", "Computer");
		Student lee = new Student(20, "Lee", "Computer Science");
		students.put(10, kim);
		students.put(20, lee);
		Student student = students.get(10);
		Student student2 = students.get(20);
		
//		students.get(20).setGrade(30);  20의 key값을 30으로 변경한다.
		student.introduceMyself();
		student2.introduceMyself();
		
		
		
		
		
		
//		map.put(101, "Kim");
//		map.put(102, "Lee");
//		map.put(103, "Park");
		
//		System.out.println(map.get(101));
	}
}
