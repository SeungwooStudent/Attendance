import java.util.LinkedList;

import com.attendance.model.Student;

public class Test {
	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<>();
		// 장 공간을 설정해놓고 값을 채운다. index로 접근하기 때문에 검색에 용이하다
		// 단 중간에 값이 삭제되었을때 어디가 빈줄 모르니까 메모리 손실 삭제불편 새로운데이터가 들어오면 찾아가기가 힘들다(찾을수는있지만)
		// 그래서 밑에 링크드리스트가 나옴
//		LinkedList<Integer> arrs = new LinkedList<>();
		// index가 없음 // 검색이 불편하다
		// 서로가 링크끼리 연결되어있다. 빈자리가 생기면 그 양옆에있는 애들이 연결되어있다 빈자리에 쉽게 접근이 가능하다. 메모리낭비가 별로없음
		// 새로운애가 들어와도 링크 끊고 다시 연결해주면 ok
		Student moonsu = new Student(1, "moonsu");
		Student seungwoo = new Student(2, "seungwoo");
		Student gildong = new Student(3, "gildong");

		LinkedList<Student> arr = new LinkedList<>();
		arr.add(moonsu);
		arr.add(seungwoo);
		arr.add(gildong);

		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).introduceMyself();
		}

		System.out.println("삭제시작");
		int id = 1;
		for (int i = 0; i < arr.size(); i++) {
			Student st = arr.get(i);
			if (st.id == id) {
				arr.remove(i);
				break;
			}
		}

		for (int i = 0; i < arr.size(); i++) {
			arr.get(i).introduceMyself();
		}

	}

}
