package step2_01.array;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_연습 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
//		int temp = 0;
//		System.out.print("첫 번째 인덱스를 입력하세요 : ");
//		int idx_01 = scan.nextInt();
//		System.out.print("두 번째 인덱스를 입력하세요 : ");
//		int idx_02 = scan.nextInt();
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if (idx_01 == i) {
//				temp = arr[idx_01];
//				arr[idx_01] = arr[idx_02]; 
//			} else if (idx_02 == i) {
//				arr[idx_02] = temp;
//			}
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println("\n");
//		
//		
//		// 문제 2) 값 2개를 입력받아 값 교체하기
//		// 예    2) 값1 입력 : 10
//		//        값2 입력 : 50
//		//		  {50, 20, 30, 40, 10}
//		System.out.print("첫 번째 값을 입력하세요 : ");
//		int getNum1 = scan.nextInt();
//		System.out.print("두 번째 값을 입력하세요 : ");
//		int getNum2 = scan.nextInt();
//		
//		int[] arr2 = {10,20,30,40,50};
//		int temp2 = 0;
//		
//		for (int i = 0; i < arr2.length; i++) {
//			
//			if (arr2[i] == getNum1) {
//				temp2 = arr[i];
//				arr2[i] = getNum2;
//			} else if (arr2[i] == getNum2) {
//				arr2[i] = temp2;
//			}
//			System.out.print(arr2[i] + " ");
//		}
//		System.out.println();
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		System.out.print("첫 번째 학번을 입력하세요 : ");
		int hakbun1 = scan.nextInt();
		System.out.print("두 번째 학번을 입력하세요 : ");
		int hakbun2 = scan.nextInt();
		
		int hakIdx1 = 0;
		int hakIdx2 = 0;
		int temp3 = 0;
		
		for (int i = 0; i < hakbuns.length; i++) {
			
			if (hakbuns[i] == hakbun1) {
				hakIdx1 = i;
				temp3 = scores[hakIdx1];
			} else if (hakbuns[i] == hakbun2) {
				hakIdx2 = i;
			}
		}
		temp3 = scores[hakIdx1];
		scores[hakIdx1] = scores[hakIdx2];
		scores[hakIdx2] = temp3;
		
		for (int i = 0; i < hakbuns.length; i++) {
			System.out.print(hakbuns[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		
	}
	
}
