package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		char[] ch = new char[text.length()];
		
		for (int i = 0; i < text.length(); i++) {
			ch[i] = text.charAt(i); 
		}
		
		// System.out.println(ch.length); // 18
		
		// [L, i, f, e,  , i, s,  , t, o, o,  , s, h, o, r, t, .]
		// System.out.println(Arrays.toString(ch));
		
		int count = 0;
		boolean isTruth = false;
		
		Outter:for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 0; j < word.length(); j++) {
				
				if (count == word.length()) {
					isTruth = true;
					break Outter;
				}
				
				if (ch[i + j] == word.charAt(j)) {
					count++;
				} else {
					count = 0;
				}
			}
		}
		
		System.out.println("isTruth : " + isTruth);
		
	}

}
