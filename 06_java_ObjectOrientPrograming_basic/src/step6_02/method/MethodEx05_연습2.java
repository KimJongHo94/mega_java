package step6_02.method;

import java.util.Scanner;

class Ex05_연습2 {

	void test1(int num) {
		int sum = 0;
		while (num >= 1) {
			sum += num;
			num--;
		}
		
		System.out.println("1부터 5까지의 합 : " + sum);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = scan.nextInt();
		}
		
		int maxNum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("최대값은 " + maxNum);
		
		scan.close();
	}
	
}


public class MethodEx05_연습2 {

	public static void main(String[] args) {

		
			Ex05_연습2 e = new Ex05_연습2();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1(5);
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		


	}

}
