
package step1_06.loop;

/*
 *  # 반복문 for
 * 
 * 1. 반복문의 조건 3가지 
 * 		1) 초기식 2) 조건식 3) 증감식
 * 
 * 2. [ 형식 ]
 * 
 * for (초기식;조건식;증감식) {
 * 		조건식이 참일때 반복할 명령어;
 * }
 * 
 * 3. for문의 실행순서
 *  1) 초기식
 *  2) 조건식  3) 명령어  4) 증감식 
 *  조건이 false가 될때까지 2)3)4) 반복 
 * 
 * 4. for문 안의 생성 변수는 for문 안에서만 접근 가능하다.
 * 
 * 5. for문도 break와 continue를 같이 사용할 수 있다.
 * 
 * */

public class LoopEx19 {

	public static void main(String[] args) {
		
		System.out.println("=== while문 ===");
		// while 조건은 boolean 많이 사용
		
		int x = 1;			           // 초기식	
		while (x <= 5) {           // 조건식
			System.out.println(x);   // 명령어
			x++;                     // 증감식
		}
		
		System.out.println("=== for문 ===");
		// ※ 순서 : ①초기식 -> ②조건식 -> ③명령어 -> ④증감식 -> ②조건식 -> ③명령어 ... 
		// for 조건은 특정값 조건식 많이 사용
		for (int i = 1; i <= 5; i++) { // for (초기식; 조건식; 증감식)
			System.out.println(i);       // 명령어
		}
		
		System.out.println();
		for (int i = 0; i < 10; i += 2) { // for문 안에서 선언한 i변수는 for {}안에서만 사용가능하다.
			if (i > 5) {
				break;                        // for문에서도 보조제어문을 사용할 수 있다.
			}
			System.out.println(i);
		}
		
		System.out.println();
		// for + [ctrl + spacebar] : for문 생성 단축키
		for (int i = 0; i < 10; i++) {
			
		}
		
		// foreach문 : 추후에 학습
		// 횟수 통제 불가능
		for (String string : args) {
			
		}
		
	}

}
