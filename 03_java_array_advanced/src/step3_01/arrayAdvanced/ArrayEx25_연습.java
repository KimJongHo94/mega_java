package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 -1로 변경한다.
 * 3. arr배열의 모든 값이 -1로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, -1, 24
 * 입력 : 87
 * 
 * 11, -1, 42, -1, 24
 * 
 */


public class ArrayEx25_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int maxNum = 0;
		int maxIdx = 0;
		int arrCnt = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));
			System.out.println("arrCnt = " + arrCnt);
			
			System.out.print("값을 입력하세요 : ");
			int getNum = scan.nextInt();
			
			for (int i = 0; i < arr.length; i++) {
				if (maxNum < arr[i]) {
					maxNum = arr[i];
					maxIdx = i;
				}
			}
			
			if (getNum == maxNum) {
				arr[maxIdx] = -1;
				arrCnt++;
				maxNum = 0;
				maxIdx = 0;
			} else {
				System.out.println("틀렸습니다. 다시 입력하세요");
			}
			
			if (arrCnt == 5) {
				System.out.println("게임이 종료되었습니다.");
				break;
			}
			
		}
	
	}
}
