package step6_02.method;


class Ex08_연습 {
	
	void printSum(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr 총합 : " + sum);
	}
	void printSumMultiple4(int[] arr) {
		int fourSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				fourSum += arr[i];
			}
		}
		System.out.println("4의 배수의 합 : " + fourSum);
	}
	void printCountMultiple4(int[] arr) {
		int fourCnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				fourCnt += 1;
			}
		}
		System.out.println("4의 배수 개수 : " + fourCnt);
	}
}


public class MethodEx08_연습 {

	public static void main(String[] args) {
		
		Ex08_연습 e = new Ex08_연습();
		
		int[] arr = { 87, 100, 11, 72, 92 };
			
		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		e.printSum(arr);
		
		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		e.printSumMultiple4(arr);
		
		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		e.printCountMultiple4(arr);
		

	}

}
