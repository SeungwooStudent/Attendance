package com.attendance.controller;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import com.attendance.model.Student;
import com.attendance.view.ConsoleUI;

public class AttendanceController {
	public void startProgram() {

		ConsoleUI consoleUI = new ConsoleUI();
		Scanner sc = new Scanner(System.in);
//		int index = 0;
//		Student students[] = new Student[Constants.MAX_STUDENT];

		LinkedList<Student> students = new LinkedList<>();
		int id = 0, grade = 0;
		String name = null, major = null;

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

					try {
						consoleUI.printInputStudentID();
						student.setId(sc.nextInt());
						isFinished = false;

						for (int i = 0; i < students.size(); i++) {
							Student std = students.get(i);
							isFinished = true;

							if (student.getId() == std.getId()) {
								Exception e = new Exception("중복된ID입니다 다시시도해주세요");
								sc = new Scanner(System.in);
								throw e;
							} else if (student.getId() != std.getId()) {
								sc = new Scanner(System.in);
							}
							isFinished = false;
						}
					} catch (InputMismatchException ime) {
						consoleUI.printInputMistmatchError();
						sc = new Scanner(System.in);
					} catch (Exception e) {
						System.out.println(e.getMessage());
						sc = new Scanner(System.in);
					}
				}

				isFinished = true;
				while (isFinished) {
					try {
						consoleUI.printInputStudentgrade();
						student.setGrade(sc.nextInt());
						isFinished = false;
					} catch (InputMismatchException ime) {
						consoleUI.printInputMistmatchError();
						sc = new Scanner(System.in);
					}
				}

				consoleUI.printInputStudentname();
				student.setName(sc.next());

				consoleUI.printInputStudentmajor();
				student.setMajor(sc.next());

				consoleUI.StudentEnrollment();

				students.add(student);

				student = new Student(id, grade, name, major);

			} else if (choice == 2) {
				// 수정

				int ide = 0;
				boolean isFind = false;
				boolean isFinished = true;
				while (isFinished) {
					try {
						consoleUI.StudentReviseID();
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
									consoleUI.StudentChangegrade();
									std.setGrade(sc.nextInt());
									std.getGrade();
									consoleUI.Changecomplete();
									isFinished = false;
								} catch (InputMismatchException ime) {
									consoleUI.printInputMistmatchError();
									sc = new Scanner(System.in);
								}
							}
						} else if (choice == 2) {
							consoleUI.StudentChangename();
							std.setName(sc.next());
							std.getName();
//							String newname = sc.next();
//							newname = std.getName();
							consoleUI.Changecomplete();
							isFinished = false;
						} else if (choice == 3) {
							consoleUI.StudentChangemajor();
							std.setMajor(sc.next());
							std.getMajor();
//							String newmajor = sc.next();
//							newmajor = std.getMajor();
							consoleUI.Changecomplete();
							isFinished = false;
						}

						break;

					}

				}
				if (!isFind) {
					consoleUI.NoneID();
				}

			} else if (choice == 3) {
				// 삭제
				boolean isFinished = true;
				boolean isFind = false;
				int delete = 0;
				while (isFinished) {
					try {
						consoleUI.StudentRemoveID();
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
						consoleUI.Removecomplete();
						break;

					}

				}
				if (!isFind) {
					consoleUI.NoneID();
				}

			} else if (choice == 4) {

				for (int i = 0; i < students.size(); i++) {
					students.get(i).introduceMyself();
				}

			} else if (choice == 5) {
				consoleUI.EndProgram();
				break;
			}

		}

	}
}
