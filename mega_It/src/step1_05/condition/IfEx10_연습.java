package step1_05.condition;

import java.util.Scanner;

/*
 * # 로그인[3단계]
 * 
 * 1. id를 입력받아 dbId와 일치할 경우에만 pw를 입력할 수 있다.
 * 2. id가 틀린 경우, "id를 확인해주세요"라는 메세지를 출력한다.
 * 3. pw가 틀린 경우, "pw를 확인해주세요"라는 메세지를 출력한다.
 * 4. id와 pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 */



public class IfEx10_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;

		System.out.print("아이디를 입력해주세요 : ");
		int insertId = scan.nextInt();
		
		if (dbId == insertId) {
			
			System.out.print("비밀번호를 입력해주세요 : ");
			int insertPw = scan.nextInt();
			
			if (dbPw == insertPw) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호를 확인해주세요.");
			}
			
		} else {
			System.out.println("아이디 확인 후 다시 시도해주세요.");
		}
		scan.close();
	}

}
