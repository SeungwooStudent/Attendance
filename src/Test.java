import java.util.HashMap;
import java.util.Map;

import com.attendance.model.Student;

public class Test {
	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>();
		
		
		Map<Integer, Student> students = new HashMap<>();
		Student kim = new Student(1, "Kim", "Computer");
		Student lee = new Student(2, "Lee", "Computer Science");
		students.put(1, kim);
		students.put(2, lee);
		Student student = students.get(2);
		students.get(2).setGrade(3);;
		student.introduceMyself();
		
		
//		map.put(101, "Kim");
//		map.put(102, "Lee");
//		map.put(103, "Park");
		
//		System.out.println(map.get(101));
	}
}
