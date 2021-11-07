package com.attendance.view;

public class ConsoleUI {

	public void display() {
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 모든학생 출력");
		System.out.println("5. 종료");
	}

	public void count() {
		System.out.println("변경하실 목록을 선택하세요");
		System.out.println("1. garde");
		System.out.println("2. name");
		System.out.println("3. major");
	}

	public void printInputMistmatchError() {
		System.out.println("반드시 숫자를 입력해주세요");
		System.out.println();
	}

	public void printInputStudentID() {
		System.out.println("학번을 입력하세요");
	}

	public void printInputStudentgrade() {
		System.out.println("학년을 입력하세요");
	}

	public void printInputStudentname() {
		System.out.println("이름을 입력하세요");
	}

	public void printInputStudentmajor() {
		System.out.println("전공을 입력하세요");
	}

	public void StudentEnrollment() {
		System.out.println("등록되었습니다");
		System.out.println();
	}

	public void StudentReviseID() {
		System.out.println("수정하실 id를 입력해주세요 ");
		System.out.println();
	}

	public void StudentChangegrade() {
		System.out.println("변경하실 grade를 입력하세요");
		System.out.println();
	}

	public void StudentChangename() {
		System.out.println("변경하실 name를 입력하세요");
		System.out.println();
	}

	public void StudentChangemajor() {
		System.out.println("변경하실 major를 입력하세요");
		System.out.println();
	}

	public void Changecomplete() {
		System.out.println("변경되었습니다.");
		System.out.println();
	}

	public void StudentRemoveID() {
		System.out.println("삭제하실 id를 입력해주세요 ");
		System.out.println();
	}

	public void Removecomplete() {
		System.out.println("삭제되었습니다.");
		System.out.println();
	}

	public void NoneID() {
		System.out.println("없는 아이디입니다 다시 시도해주세요");
		System.out.println();
	}

	public void EndProgram() {
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println();
	}

}
