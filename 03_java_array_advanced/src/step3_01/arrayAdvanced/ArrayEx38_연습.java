package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("첫번째 인덱스 입력 : ");
		int getIdx01 = scan.nextInt();
		System.out.print("두번째 인덱스 입력 : ");
		int getIdx02 = scan.nextInt();
				
		System.out.print("문제 1)");
		System.out.println("값 출력 : " + arr[getIdx01][getIdx02] + "\n");
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값을 입력 : ");
		int getData = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == getData) {
					getIdx01 = i;
					getIdx02 = j;
				}
			}
		}
		System.out.print("문제 2) ");
		System.out.println("인덱스1 출력 : " + getIdx01 + ", 인덱스2 출력 : " + getIdx02 + "\n");
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int maxNum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (maxNum < arr[i][j]) {
					maxNum = arr[i][j];
					getIdx01 = i;
					getIdx02 = j;
				}
			}
		}
		
		System.out.print("문제 3) ");
		System.out.println(getIdx01 + " " + getIdx02 + "\n");
		
		// 문제 4) 값 2개를 입력받아 값 교체
		int temp = 0;
		
		System.out.print("첫번째 값 입력 : ");
		int getData01 = scan.nextInt();
		System.out.print("두번째 값 입력 : ");
		int getData02 = scan.nextInt();
		
		getIdx01 = 0;
		getIdx02 = 0;
		int getIdx03 = 0;
		int getIdx04 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] == getData01) {
					getIdx01 = i;
					getIdx02 = j;
				} else if (arr[i][j] == getData02) {
					getIdx03 = i;
					getIdx04 = j;
				}
			}
		}
		
		System.out.print("Before >> ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
		
		// 첫번째 값 temp에 담기
		temp = arr[getIdx01][getIdx02];
		arr[getIdx01][getIdx02] = arr[getIdx03][getIdx04];
		arr[getIdx03][getIdx04] = temp;
		
		System.out.print("After  >> ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();

	}

}
