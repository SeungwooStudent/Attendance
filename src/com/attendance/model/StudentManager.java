package com.attendance.model;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import com.attendance.view.ConsoleUI;

public class StudentManager {
	Scanner sc = new Scanner(System.in);
	private LinkedList<Student> students = new LinkedList<>();
	ConsoleUI consoleUI = new ConsoleUI();

	int id = 0, grade = 0;
	String name = null, major = null;
	boolean isFinished;

	public void printInputStudentgrade() {

		try {
			isFinished = false;
		} catch (InputMismatchException ime) {
			consoleUI.printInputMistmatchError();
			sc = new Scanner(System.in);
		}
	}

	public boolean isCheckId(int id) {
		for (int i = 0; i < students.size(); i++) {
			Student std = students.get(i);
			if (id == std.getId()) {
				return true;
			}
		}
		return false;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void printStudents() {
		for (int i = 0; i < students.size(); i++) {
			students.get(i).introduceMyself();
		}
	}

	public Student findStudentByID(int id) {
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	public void changeGrade(int id, int grade) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.get(i).setGrade(grade);
			}
		}
	}

	public void changeName(int id, String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.get(i).setName(name);
				;
			}
		}
	}

	public void changeMajor(int id, String major) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.get(i).setMajor(major);
				;
			}
		}
	}

	public void removeID(int id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				students.remove(i);
			}
		}
	}
}