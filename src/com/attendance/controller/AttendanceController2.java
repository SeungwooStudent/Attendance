package com.attendance.controller;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import com.attendance.model.Student;
import com.attendance.model.StudentManager2;
import com.attendance.view.ConsoleUI;

public class AttendanceController2 {
	public void startProgram() {

		ConsoleUI consoleUI = new ConsoleUI();
		Scanner sc = new Scanner(System.in);

		LinkedList<Student> students = new LinkedList<>();
		int id = 0, grade = 0;
		String name = null, major = null;

		StudentManager2 studentManager = new StudentManager2();

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

					try {
						consoleUI.printInputStudentID();
						id = sc.nextInt();
						boolean checkId = studentManager.checkId(id);
						if (checkId) {
							Exception e = new Exception("중복된ID입니다 다시시도해주세요");
							throw e;
						}
						isFinished = false;
					} catch (InputMismatchException ime) {
						consoleUI.printInputMistmatchError();
						sc = new Scanner(System.in);
					} catch (Exception e) {
						System.out.println(e.getMessage());
						sc = new Scanner(System.in);
						isFinished = true;
					}

				}

				isFinished = true;
				while (isFinished) {
					try {
						consoleUI.printInputStudentgrade();
						grade = sc.nextInt();
						isFinished = false;
					} catch (InputMismatchException ime) {
						consoleUI.printInputMistmatchError();
						sc = new Scanner(System.in);
					}
				}

				consoleUI.printInputStudentname();
				name = sc.next();

				consoleUI.printInputStudentmajor();
				major = sc.next();
				Student student = new Student(id, grade, name, major);

//				studentManager.addStudent(student);

				studentManager.studentID(student);
				consoleUI.studentEnrollment();

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
				Student student = studentManager.findStudentByID(ide);
				if (student == null) {
					consoleUI.noneID();
					continue;
				}

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
							grade = sc.nextInt();
							studentManager.changeGrade(ide, grade);
							consoleUI.changeComplete();
							isFinished = false;
						} catch (InputMismatchException ime) {
							consoleUI.printInputMistmatchError();
							sc = new Scanner(System.in);
						}
					}
				} else if (choice == 2) {
					consoleUI.studentChangename();
					name = sc.next();
					studentManager.changeName(ide, name);
					consoleUI.changeComplete();
					isFinished = false;

				} else if (choice == 3) {
					consoleUI.studentChangemajor();
					major = sc.next();
					studentManager.changeMajor(ide, major);
					consoleUI.changeComplete();
					isFinished = false;
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
						Student student = studentManager.findStudentByID(delete);
						if (student == null) {
							consoleUI.noneID();
						}
						if (student != null) {
							studentManager.removeID(delete);
							consoleUI.removeComplete();
						}

						isFinished = false;
					} catch (InputMismatchException ime) {
						consoleUI.printInputMistmatchError();
						sc = new Scanner(System.in);
					}

				}

			} else if (choice == 4) {
				studentManager.printAll();

			} else if (choice == 5) {
				studentManager.removeAll();
				consoleUI.removeComplete();

			} else if (choice == 6) {
				consoleUI.endProgram();
				break;
			}

		}

	}
}
