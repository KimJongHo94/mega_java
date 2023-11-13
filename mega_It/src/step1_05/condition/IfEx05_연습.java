package step1_05.condition;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. id와 pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 id와 pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		int insertId = 0;
		int insertPw = 0;
		
		System.out.print("등록하실 아이디를 입력하세요 : ");
		dbId = scan.nextInt();
		
		System.out.print("등록하실 비밀번호를 입력하세요 : ");
		dbPw = scan.nextInt();
		
		System.out.println("가입이 정상적으로 되었습니다.");
		
		System.out.println("-로그인-");
		System.out.print("아이디를 입력하세요 : ");
		insertId = scan.nextInt();
		
		System.out.print("비밀번호를 입력하세요 : ");
		insertPw = scan.nextInt();
		
		if (dbId == insertId && dbPw == insertPw) {
			System.out.println("로그인 성공!");
		}
		if (dbId != insertId || dbPw != insertPw) {
			System.out.println("로그인 실패!");
		}
		scan.close();
	}

}
