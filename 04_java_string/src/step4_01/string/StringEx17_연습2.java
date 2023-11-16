package step4_01.string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 단어 교체하기(replace)
 * 
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예)
 * 		Life is too short.
 * 		변경하고 싶은 단어입력 : Life
 * 		바꿀 단어입력 : Time
 * 
 * 		Time is too short.
 */


public class StringEx17_연습2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println("Before) " + text);
		
		char[] textCh = new char[text.length()];
		
		for (int i = 0; i < textCh.length; i++) {
			textCh[i] = text.charAt(i);
		}
		
		System.out.println(Arrays.toString(textCh));
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.next();
		
		int[] temp = new int[word.length()];
		System.out.println(temp.length);
		int idx = 0;
		int count = 0;
		boolean isTruth = false;
		
		if (word != null && !word.isEmpty()) {
			
			Outter:for (int i = 0; i < textCh.length - 1; i++) {
				for (int j = 0; j < word.length(); j++) {
					
					if (count == word.length()) {
						isTruth = true;
						break Outter;
					}
					
					if (textCh[i + j] == word.charAt(j)) {
						temp[idx] = j;
						System.out.println(temp[idx]);
						count++;
						idx++;
					}
					else {
						count = 0;
					}
					
				}
			}
			
		}
		else {
			System.out.println("글자를 다시 입력하세요");
		}
		
		if (isTruth == true) { // 입력한 글자가 textCh에 다 있다면
			
			System.out.print("바꿀 단어 입력 : ");
			String changeWord = scan.next();
			
			if (changeWord != null && !changeWord.isEmpty()) { // null이 아니고 공백이 아닐 때
				
				int firstIdx = temp[0];
				int lastIdx = temp[idx - 1];
				String frontWord = "";
				String lastWord = "";
				
				for (int i = 0; i < firstIdx; i++) {
					frontWord += String.valueOf(textCh[i]);
				}
				for (int i = lastIdx + 1; i < textCh.length; i++) {
					lastWord += String.valueOf(textCh[i]);
				}
				
				String result = frontWord + changeWord + lastWord;
				
				System.out.println(result);
				
				
			}
		}
		
		
		
	}

}
