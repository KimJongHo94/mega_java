package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

//class Ex03{
//	int[] arr = {87, 100, 11, 72, 92};
//}

class Ex03_연습 {
	
	int[] arr = {87, 100, 11, 72, 92};
	
}


public class ClassEx03_연습 {

	public static void main(String[] args) {
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		Ex03_연습 e = new Ex03_연습();
		
		int sum = 0;
				
		for (int i = 0; i < e.arr.length; i++) {
			sum += e.arr[i];
		}
		
		System.out.println("sum = " + sum); // 362
		
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		int fourSum = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) {
				fourSum += e.arr[i];
			}
		}
		
		System.out.println("fourSum : " + fourSum); // 264
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int fourCnt = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) {
				fourCnt += 1;
			}
		}
		
		System.out.println("fourCnt : " + fourCnt + "개"); // 3개
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		int even = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 2 == 0) {
				even += 1;
			}
		}
		System.out.println("even : " + even + "개");
 

	}

}
