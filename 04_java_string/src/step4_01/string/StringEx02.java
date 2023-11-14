package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 비교 메서드 equals();
 * 
 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
 * 
 * */

public class StringEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 비교 테스트 입력1 : ");
		String str1 = scan.next();
		
		System.out.print("문자열 비교 테스트 입력2 : ");
		String str2 = scan.next();
		
		// 비교 불가
		if (str1 == str2) {
			System.out.println("문자열이 동일");
		}
		else {
			System.out.println("문자열이 다름");
		}
		
		// equals return 값 : boolean(false, true)
		// System.out.println(str1.equals(str2));
		// 주소를 비교하는게 아닌 문자열에 담긴 값만 비교할 때 .equals 사용해서 비교
		// 비교 가능
		// (참고) 문자열이 같지 않은 경우는 (!)연산자를 사용한다.
		if (!str1.equals(str2)) { // false
			System.out.println("서로 다른 값");
		} else { // true
			System.out.println("서로 동일 값");
		}
		
		scan.close();
	}
	
}
