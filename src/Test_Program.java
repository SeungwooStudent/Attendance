//import java.util.InputMismatchException;
//import java.util.LinkedList;
//import java.util.Scanner;
//
//class Studentnumber {
//	public void number() {
//		System.out.println("반드시 숫자를 입력해주세요");
//		System.out.println();
//	}
//
//	public void change() {
//		System.out.println("변경되었습니다");
//		System.out.println();
//	}
//
//	public void noneId() {
//		boolean isFind = true;
//		System.out.println("없는 아이디입니다 다시 시도해주세요");
//		System.out.println();
//	}
//
//	public int id;
//
//	public int getid() {
//		return this.id;
//	}
//
//}
//
//public class Test_Program {
//
//	public static void main(String[] args) {
//
//		final Controller controller = new Controller();
//		Scanner sc = new Scanner(System.in);
////		int index = 0;
////		Student students[] = new Student[Constants.MAX_STUDENT];
//
//		LinkedList<Student> students = new LinkedList<>();
//		int id = 0, grade = 0;
//		String name = null, major = null;
//
//		Student student = new Student(id, grade, name, major);
//		Studentnumber stn = new Studentnumber();
//
//		while (true) {
//
//			controller.display();
//			int choice = 0;
//			try {
//				choice = sc.nextInt();
//			} catch (InputMismatchException ime) {
//				stn.number();
//				sc = new Scanner(System.in);
//			}
//
//			if (choice == 1) {
//
//				boolean isFinished = true;
//				while (isFinished) {
//
//					try {
//						System.out.println("학번을 입력하세요");
//						student.id = sc.nextInt();
//						isFinished = false;
//
//						for (int i = 0; i < students.size(); i++) {
//							Student std = students.get(i);
//							isFinished = true;
//
//							stn.id = student.id;
//
//							if (stn.id == std.id) {
//								Exception e = new Exception("중복된ID입니다 다시시도해주세요");
//								sc = new Scanner(System.in);
//								throw e;
//							} else if (stn.id != std.id) {
//								sc = new Scanner(System.in);
//							}
//							isFinished = false;
//						}
//					} catch (InputMismatchException ime) {
//						stn.number();
//						sc = new Scanner(System.in);
//					} catch (Exception e) {
//						System.out.println(e.getMessage());
//						sc = new Scanner(System.in);
//					}
//				}
//
//				isFinished = true;
//				while (isFinished) {
//					try {
//						System.out.println("학년을 입력하세요");
//						student.grade = sc.nextInt();
//						isFinished = false;
//					} catch (InputMismatchException ime) {
//						stn.number();
//						sc = new Scanner(System.in);
//					}
//				}
//
//				System.out.println("이름을 입력하세요");
//				student.name = sc.next();
//				System.out.println("전공을 입력하세요");
//				student.major = sc.next();
//				System.out.println("등록되었습니다");
//				System.out.println();
//				students.add(student);
//
//				student = new Student(id, grade, name, major);
//
//			} else if (choice == 2) {
//				// 수정
//
//				int ide = 0;
//				boolean isFind = false;
//				boolean isFinished = true;
//				while (isFinished) {
//					try {
//						System.out.println("수정하실 id를 입력해주세요 ");
//						ide = sc.nextInt();
//						isFinished = false;
//					} catch (InputMismatchException ime) {
//						stn.number();
//						sc = new Scanner(System.in);
//					}
//				}
//
//				for (int i = 0; i < students.size(); i++) {
//					Student std = students.get(i);
//
//					if (ide == std.id) {
//						isFind = true;
//						isFinished = true;
//
//						while (isFinished) {
//							try {
//								controller.count();
//								choice = sc.nextInt();
//								isFinished = false;
//							} catch (InputMismatchException ime) {
//								stn.number();
//								sc = new Scanner(System.in);
//							}
//						}
//
//						isFinished = true;
//						if (choice == 1) {
//							while (isFinished) {
//								try {
//									System.out.println("변경하실 grade를 입력하세요");
//									int newgrade = sc.nextInt();
//									std.grade = newgrade;
//									stn.change();
//									isFinished = false;
//								} catch (InputMismatchException ime) {
//									stn.number();
//									sc = new Scanner(System.in);
//								}
//							}
//						} else if (choice == 2) {
//							System.out.println("변경하실 name을 입력하세요");
//							String newname = sc.next();
//							std.name = newname;
//							stn.change();
//							isFinished = false;
//						} else if (choice == 3) {
//							System.out.println("변경하실 major를 입력하세요");
//							String newmajor = sc.next();
//							std.major = newmajor;
//							stn.change();
//							isFinished = false;
//
//						}
//						break;
//
//					}
//
//				}
////				if (!isFind) {
////					System.out.println("없는 아이디입니다 다시 시도해주세요");
////					System.out.println();
////				}
//				if (!isFind) {
//					stn.noneId();
//				}
//
//			} else if (choice == 3) {
//				// 삭제
//				boolean isFinished = true;
//				boolean isFind = false;
//				int delete = 0;
//				while (isFinished) {
//					try {
//						System.out.println("삭제하실 id를 입력해주세요 ");
//						delete = sc.nextInt();
//						isFinished = false;
//					} catch (InputMismatchException ime) {
//						stn.number();
//						sc = new Scanner(System.in);
//					}
//				}
//
//				for (int i = 0; i < students.size(); i++) {
//					Student std = students.get(i);
//
//					if (delete == std.id) {
//						isFind = true;
//						students.remove(i);
//						System.out.println("삭제되었습니다");
//						break;
//
//					}
//
//				}
//				if (!isFind) {
//					stn.noneId();
//				}
////				if (!isFind) {
////					System.out.println("없는 아이디입니다 다시 시도해주세요");
////					System.out.println();
////				}
//
//			} else if (choice == 4) {
//
//				for (int i = 0; i < students.size(); i++) {
//					students.get(i).introduceMyself();
//				}
//
//			} else if (choice == 5) {
//				System.out.println("프로그램이 종료되었습니다");
//				break;
//			}
//
//		}
//
//	}
//}
