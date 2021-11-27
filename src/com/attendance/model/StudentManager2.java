package com.attendance.model;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import com.attendance.view.ConsoleUI;

public class StudentManager2 {
	Scanner sc = new Scanner(System.in);
//	private LinkedList<Student> students = new LinkedList<>();
	ConsoleUI consoleUI = new ConsoleUI();

	private Map<Integer, Student> student = new HashMap<>();
	int id, grade;
	String name, major;
	boolean isFinished;

	public void studentID(Student studentss) {
		student.put(studentss.getId(), studentss);
	}

	public boolean checkId(int id) {
		if (student.containsKey(id)) {
			return true;
		}
		return false;
	}

	public void printInputStudentgrade() {

		try {
			isFinished = false;
		} catch (InputMismatchException ime) {
			consoleUI.printInputMistmatchError();
			sc = new Scanner(System.in);
		}
	}

//	public void addStudent(Student student) {
//		students.add(student);
//	}

	public Student findStudentByID(int id) {
		if (student.containsKey(id)) {
			Student studente = student.get(id);
			return studente;
		}
		return null;
	}

	public void changeGrade(int id, int grade) {
		if (student.containsKey(id)) {
			student.get(id).setGrade(grade);
		}
	}

	public void changeName(int id, String name) {
		for (int i = 0; i < student.size(); i++) {
			if (student.containsKey(id)) {
				student.get(id).setName(name);
			}
		}

	}

	public void changeMajor(int id, String major) {
		if (student.containsKey(id)) {
			student.get(id).setMajor(major);
		}
	}

	public void removeID(int id) {
		if (student.containsKey(id)) {
			student.remove(id);
		}
	}

	public void printAll() {
		Iterator<Integer> iterator = student.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			student.get(key).introduceMyself();
		}
	}

	public void removeAll() {
		Iterator<Integer> iterator = student.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			iterator.remove();
//			student.remove(key);

		}
	}

}