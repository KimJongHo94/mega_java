package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		//System.out.println("제시어 : " + start);
		boolean isRun = true;
		
//		String temp = start.substring(start.length()-1);
//		System.out.println(temp);
		
		while (isRun) {
			
			System.out.println("제시어 : " + start);
			System.out.print("입력 : ");
			String getStr = scan.next();
			
			if (getStr.equals("quit")) {
				System.out.println("- 종료 -");
				break;
			}
			
			String firstStr = start.substring(start.length()-1);
		
			if (getStr.substring(0, 1).equals(firstStr)) {
				
				start = getStr;
				
			} else {
				continue;
			}
			
		}
		scan.close();
		
	}

}
