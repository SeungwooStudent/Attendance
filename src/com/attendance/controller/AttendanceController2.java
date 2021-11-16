package com.attendance.controller;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import com.attendance.model.Student;
import com.attendance.model.StudentManager;
import com.attendance.view.ConsoleUI;

public class AttendanceController2 {
	public void startProgram() {

		ConsoleUI consoleUI = new ConsoleUI();
		Scanner sc = new Scanner(System.in);

		LinkedList<Student> students = new LinkedList<>();
		int id = 0, grade = 0;
		String name = null, major = null;
		StudentManager studentmanager = new StudentManager();
		Student student = new Student(id, grade, name, major);

		while (true) {

			consoleUI.display();
			int choice = 0;
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException ime) {
				consoleUI.printInputMistmatchError();
				sc = new Scanner(System.in);
			}

			if (choice == 1) {
				boolean isFinished = true;
				while (isFinished) {
					studentmanager.choiceID(id);
					studentmanager.isCheckId(student.getId());
					isFinished = false;
				}
				isFinished = true;
				while (isFinished) {
					studentmanager.choicegrade(student.getGrade());
					isFinished = false;
				}

				consoleUI.printInputStudentname();
				student.setName(sc.next());

				consoleUI.printInputStudentmajor();
				student.setMajor(sc.next());

				consoleUI.studentEnrollment();

				students.add(student);

				student = new Student(id, grade, name, major);

			} else if (choice == 2) {
				// 수정

				int ide = 0;
				boolean isFind = false;
				boolean isFinished = true;
				while (isFinished) {
					try {
						consoleUI.studentReviseID();
						ide = sc.nextInt();
						isFinished = false;
					} catch (InputMismatchException ime) {
						consoleUI.printInputMistmatchError();
						sc = new Scanner(System.in);
					}
				}

				for (int i = 0; i < students.size(); i++) {
					Student std = students.get(i);

					if (ide == std.getId()) {
						isFind = true;
						isFinished = true;

						isFinished = true;
						while (isFinished) {
							try {
								consoleUI.count();
								choice = sc.nextInt();
								isFinished = false;
							} catch (InputMismatchException ime) {
								consoleUI.printInputMistmatchError();
								sc = new Scanner(System.in);
							}
						}

						isFinished = true;
						if (choice == 1) {
							while (isFinished) {
								try {
									consoleUI.studentChangegrade();
									std.setGrade(sc.nextInt());
//									std.getGrade();
									consoleUI.changeComplete();
									isFinished = false;
								} catch (InputMismatchException ime) {
									consoleUI.printInputMistmatchError();
									sc = new Scanner(System.in);
								}
							}
						} else if (choice == 2) {
							consoleUI.studentChangename();
							std.setName(sc.next());
//							std.getName();
							consoleUI.changeComplete();
							isFinished = false;
						} else if (choice == 3) {
							consoleUI.studentChangemajor();
							std.setMajor(sc.next());
//							std.getMajor();
							consoleUI.changeComplete();
							isFinished = false;
						}

						break;

					}

				}
				if (!isFind) {
					consoleUI.noneID();
				}

			} else if (choice == 3) {
				// 삭제
				boolean isFinished = true;
				boolean isFind = false;
				int delete = 0;
				while (isFinished) {
					try {
						consoleUI.studentRemoveID();
						delete = sc.nextInt();
						isFinished = false;
					} catch (InputMismatchException ime) {
						consoleUI.printInputMistmatchError();
						sc = new Scanner(System.in);
					}
				}

				for (int i = 0; i < students.size(); i++) {
					Student std = students.get(i);

					if (delete == std.getId()) {
						isFind = true;
						students.remove(i);
						consoleUI.removeComplete();
						break;

					}

				}
				if (!isFind) {
					consoleUI.noneID();
				}

			} else if (choice == 4) {

				for (int i = 0; i < students.size(); i++) {
					students.get(i).introduceMyself();
				}

			} else if (choice == 5) {
				consoleUI.endProgram();
				break;
			}

		}

	}
}