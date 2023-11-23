package step6_02.method;



class Ex11_연습 {
	
	int test1(int[] arr) { 
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum; 
	}
	int test2(int[] arr) { 
		
		int fourSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				fourSum += arr[i];
			}
		}
		
		return fourSum; 
	}
	int test3(int[] arr) { 
		
		int fourCnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				fourCnt += 1;
			}
		}
		
		return fourCnt; 
	}
	int test4(int[] arr) { 
		
		int even = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even += 1;
			}
		}
		
		return even; 
	}

}




public class MethodEx11_연습 {

	public static void main(String[] args) {

		
		Ex11_연습 e = new Ex11_연습();
		
		int[] arr = {87, 100, 11, 72, 92};

		// 문제 1) arr의 요소들의 전체 합 리턴
		// 정답 1) 362
		int tot = e.test1(arr);
		System.out.println("tot = " + tot);
		
		
		
		// 문제 2) arr의 요소들의 4의 배수의 합 리턴
		// 정답 2) 264
		tot = e.test2(arr);
		System.out.println("tot = " + tot);
		
		
		
		// 문제 3) arr의 요소들의 4의 배수의 개수 리턴
		// 정답 3) 3
		int cnt = e.test3(arr);
		System.out.println("cnt = " + cnt);
		
		
		
		// 문제 4) arr의 요소들의 짝수의 개수 리턴
		// 정답 4) 3
		cnt = e.test4(arr);
		System.out.println("cnt = " + cnt);
		

	}

}
