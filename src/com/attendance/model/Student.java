package com.attendance.model;
import java.util.LinkedList;
import java.util.Scanner;

public class Student {
	public int id; // 학번
	public int grade; // 학년
	public String name; // 이름
	public String major; // 전공
	public int delete = 0;
	
	
	
//	int choice;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	LinkedList<Student> students = new LinkedList<>();
//	final Controller controller = new Controller();

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		grade = 4;
		major = "computer";
	}

	public Student(int id, int grade, String name, String major) {
		this.id = id;
		this.grade = grade;
		this.name = name;
		this.major = major;
	}

	public void introduceMyself() {
		System.out.println("=============");
		System.out.println("id : " + id);
		System.out.println("grade : " + grade);
		System.out.println("name : " + name);
		System.out.println("major : " + major);
		System.out.println("=============");
	}

	public void noneId(boolean isFind) {
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
