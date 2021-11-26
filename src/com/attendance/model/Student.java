package com.attendance.model;

import java.util.LinkedList;

public class Student {
	private int id; // 학번
	private int grade; // 학년
	private String name; // 이름
	private String major; // 전공
	private int delete = 0;
	LinkedList<Student> students = new LinkedList<>();
//	int choice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getDelete() {
		return delete;
	}

	public void setDelete(int delete) {
		this.delete = delete;
	}

	public LinkedList<Student> getStudents() {
		return students;
	}

	public void setStudents(LinkedList<Student> students) {
		this.students = students;
	}
	
	public Student(int grade, String name, String major) {
		this.grade = grade;
		this.name = name;
		this.major = major;
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


}
