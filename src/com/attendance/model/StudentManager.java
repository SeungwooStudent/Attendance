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
	boolean isFinished;

	Student student = new Student(id, grade, name, major);

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
//				isFinished = true;

				if (student.getId() == std.getId()) {
					return false;
////					Exception e = new Exception("중복된ID입니다 다시시도해주세요");
//					sc = new Scanner(System.in);
				} else if (student.getId() != std.getId()) {
					return true;
				}
//				isFinished = false;
			}
		
		return true;

	}
}