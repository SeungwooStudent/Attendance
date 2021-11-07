import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("아이디를 입력하세요");
			int id = -1;
			try {
				id = sc.nextInt();

			} catch (InputMismatchException ime) {
				System.out.println("잘못입력하였습니다");
				sc = new Scanner(System.in);
				//초기화 꼭 해줘야됨 이유는 ? 이미 try에서 에러가나오는 값이 입력되어있기 때문에 catch에서는 그게 계속 입력되어있다고 판단.
			}
			if(id != -1) {
				System.out.println("입력하신 id는 "+ id + "입니다");
			}
		}
	}

}
