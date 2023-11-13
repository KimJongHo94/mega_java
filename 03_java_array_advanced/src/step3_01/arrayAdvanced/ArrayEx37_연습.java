package step3_01.arrayAdvanced;

/*
 *	# 2차원배열 기본문제[1단계]
*/

public class ArrayEx37_연습 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
			}
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.print("문제 1) ");
		System.out.println("전체 합 : " + sum + "\n");
		
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		
		System.out.print("문제 2) ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println("\n");
		
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		int fourSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					fourSum += arr[i][j];
				}
			}
		}
		System.out.print("문제 3) ");
		System.out.println("4의 배수의 합 : " + fourSum + "\n");
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		int fourCnt = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					fourCnt += 1;
				}
			}
		}
		
		System.out.print("문제 4) ");
		System.out.println("4의 배수 개수는 " + fourCnt + "개" + "\n");

	}

}
