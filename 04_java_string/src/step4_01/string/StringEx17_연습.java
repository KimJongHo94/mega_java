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


public class StringEx17_연습 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		text = text.replace(" ", "/");
		
		String[] temp = text.split("/");
		
		//System.out.println(Arrays.toString(temp));
				
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		for (int i = 0; i < temp.length; i++) {
			
			if (word.equals(temp[i])) {
				
				System.out.print("변경 할 단어를 입력하세요 : ");
				String changeWord = scan.nextLine();
				
				if (changeWord != null && !changeWord.isEmpty()) {
					temp[i] = changeWord;
				} else {
					System.out.println("다시 입력하세요");
					continue;
				}
				
			}	
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		
		scan.close();
		
	}

}
