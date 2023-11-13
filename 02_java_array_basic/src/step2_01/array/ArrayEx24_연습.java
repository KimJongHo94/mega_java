package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		int[] a = { 10 , 4 , 5 , 3 , 1 };
		
		// 문제 1) 전체 요소의 합출력
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("전체 요소의 합 : " + sum + "\n"); // 23
		
		// 문제 2) 데이터를 입력하면 배열의 인덱스 출력
		// 예) 5 => 2  ,  1 => 4
		System.out.print("찾을 데이터를 입력하세요 : ");
		int data = scan.nextInt();
		
		int dataIdx = -1;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == data) {
				dataIdx = i;
				break;
			}
 		}
		
		if (dataIdx < 0) {
			System.out.println("해당 데이터는 존재하지 않습니다.");
		} else {
			System.out.println(data + " 데이터의 인덱스 : " + dataIdx + "\n");
		}
		
		// 문제 3) 배열의 인덱스를 입력하면 데이터 출력
		// 예) 2 => 5  , 4 => 1
		System.out.print("배열의 인덱스를 입력하세요 : ");
		int findIdx = scan.nextInt();
		
		if (0 > findIdx || findIdx > a.length) {
			System.out.println("해당 인덱스는 존재하지 않습니다.");
		} else {
			System.out.println(findIdx + " 인덱스의 값은 " + a[findIdx] + "입니다." + "\n");
		}
		
		
		// 문제 4) 배열중 가장 큰 데이터 출력 
		// 예) 10
		int maxNum = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (maxNum < a[i]) {
				maxNum = a[i];
			}
		}
		System.out.println("a 배열 중 가장 큰 데이터는 " + maxNum + "입니다." + "\n");
		
		// 문제 5) 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		int oddCnt = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				oddCnt += 1;
			}
		}
		System.out.println("배열중 홀수의 개수는 " + oddCnt + "개 입니다." + "\n");
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0 , 0 , 5 , 3 , 1}
		int[] b = {0 , 0 , 0 , 0 , 0};
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 == 0) {
				b[i] = 0;
			} else if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		// 0 0 5 3 1
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		
		// 문제 7)  a의 값중 홀수만 c에 저장(저장위치는 앞에서부터 저장)
		// 예) c => {5, 3, 1, 0, 0}
		int[] c = { 0 , 0 , 0 , 0 , 0 };
		
		
	}

}
