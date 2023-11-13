package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수 찾기[3단계] (for문)
 * 
 * 1. 숫자를 한 개 입력받는다.
 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
 * 
 * 예) Enter Number ? 1000
 *    1000보다 큰 첫번재 소수는 1009
 * 예) Enter Number ? 500
 *    500보다 큰 첫번째 소수는 503
 *    
 */


public class LoopEx32_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Number ? ");
		int getNumber = scan.nextInt();
			
		int maxNum = 0;
		
		for (int i = 1; i <= getNumber; i++) {
			
			int cnt = 0;
		
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt += 1;
				}
				
			}
			
			if (cnt == 2) {
				
				if (maxNum < i) {
					maxNum = i;
				}
			}
			
		}		
		
		Outter: for (int i = 1; i <= getNumber + maxNum; i ++) {
			
			int cnt = 0;
			
			for (int j = 1; j <= i; j++) {
				
				if (i % j == 0) {
					cnt += 1;
				}
				
			}
			
			if (i > getNumber && cnt == 2) {
				System.out.println("입력받은 수 : " + getNumber);
				System.out.println("입력받은 수보다 더 큰 첫번째 소수 : " + i);
				break Outter;
			}
			
		}
		
		scan.close();
		
	}

}
