package com.attendance.model;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import com.attendance.view.ConsoleUI;

public class StudentManager {
	Scanner sc = new Scanner(System.in);
	LinkedList<Student> students = new LinkedList<>();
	ConsoleUI consoleUI = new ConsoleUI();

	int id = 0, grade = 0;
	String name = null, major = null;

	Student student = new Student(id, grade, name, major);

	public void choiceID(int id) {
		consoleUI.printInputStudentID();
//		id = student.getId();
		student.setId(sc.nextInt());

	}

	public void choicegrade(int choice) {
		try {
			consoleUI.printInputStudentgrade();
			student.setGrade(sc.nextInt());
		} catch (InputMismatchException ime) {
			consoleUI.printInputMistmatchError();
			sc = new Scanner(System.in);
		}
	}

	public boolean isCheckId(int id) {
		try {
			for (int i = 0; i < students.size(); i++) {
				Student std = students.get(i);

				if (id == std.getId()) {
					Exception e = new Exception("중복된ID입니다 다시시도해주세요");
					sc = new Scanner(System.in);
					throw e;
				} else if (id != std.getId()) {
					sc = new Scanner(System.in);
				}

			}
		} catch (InputMismatchException ime) {
			consoleUI.printInputMistmatchError();
			sc = new Scanner(System.in);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			sc = new Scanner(System.in);
		}

		return false;
	}
}