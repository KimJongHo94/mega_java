package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 입력
 * 
 *  next() : 공백을 기준으로 한단어만 입력받는다.
 * 
 * */

public class StringEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력 : ");
		String str = scan.next(); // 공백을 제외한 글자를 입력 받는다.
		// 안 녕 하 세 요 => 안
		// 안녕 하세요    => 안녕
		System.out.println("입력한 값 : " + str + " 입니다.");
		
		System.out.println();
		
		System.out.print("문자열 입력 : ");
		String str2 = scan.nextLine(); // 공백을 포함한 글자를 입력받는다.
		System.out.println("입력한 값 : " + str2 + " 입니다.");
	
		scan.close();
		
	}

}
