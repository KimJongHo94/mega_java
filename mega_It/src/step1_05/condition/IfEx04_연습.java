package step1_05.condition;

import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. id와 pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 *    (db > database > 저장되어있는 데이터) 
 * 예) 로그인 성공 or 로그인 실패
 * 
 */


public class IfEx04_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.print("아이디를 입력하세요 : ");
		int insertId = scan.nextInt();
		
		System.out.print("비밀번호를 입력하세요 : ");
		int insertPw = scan.nextInt();
		
		if (dbId == insertId && dbPw == insertPw) {
			System.out.println("로그인 성공!");
		}
		if (dbId != insertPw || dbPw != insertPw) {
			System.out.println("로그인 실패!");
		}
		
		
//		System.out.print("아이디를 입력하세요 : ");
//		int insertId = scan.nextInt();
//		
//		if (dbId == insertId) {
//			
//			System.out.print("비밀번호를 입력하세요 : ");
//			insertPw = scan.nextInt();
//			
//			if (dbPw == insertPw) {
//				System.out.println("로그인에 성공하셨습니다.");
//			} else {
//				System.out.println("비밀번호를 확인하세요.");
//			}
//		} else {
//			System.out.println("아이디를 확인하세요.");
//		}
		
		scan.close();
	}

}
