package com.attendance.view;

public class ConsoleUI {

	public void display() {
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 모든학생 출력");
		System.out.println("5. 전체삭제");
		System.out.println("6. 종료");
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

	public void studentEnrollment() {
		System.out.println("등록되었습니다");
		System.out.println();
	}

	public void studentReviseID() {
		System.out.println("수정하실 id를 입력해주세요 ");
		System.out.println();
	}

	public void studentChangegrade() {
		System.out.println("변경하실 grade를 입력하세요");
		System.out.println();
	}

	public void studentChangename() {
		System.out.println("변경하실 name를 입력하세요");
		System.out.println();
	}

	public void studentChangemajor() {
		System.out.println("변경하실 major를 입력하세요");
		System.out.println();
	}

	public void changeComplete() {
		System.out.println("변경되었습니다.");
		System.out.println();
	}

	public void studentRemoveID() {
		System.out.println("삭제하실 id를 입력해주세요 ");
		System.out.println();
	}

	public void removeComplete() {
		System.out.println("삭제되었습니다.");
		System.out.println();
	}

	public void noneID() {
		System.out.println("없는 아이디입니다 다시 시도해주세요");
		System.out.println();
	}

	public void endProgram() {
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println();
	}

}
