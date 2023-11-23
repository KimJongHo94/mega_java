package step6_02.method;


class Ex06_연습 {
	
	void test1(int x, int y) {
		
		int result = x + y;
		
		System.out.println("result : " + result);
		
	}
	
	void test2(int[] arr) {
		int maxNum = 0;
		
		int[] temp = arr;
		
		for (int i = 0; i < temp.length; i++) {
			if (maxNum < temp[i]) {
				maxNum = temp[i];
			}
		}
		
		System.out.println("최대값 : " + maxNum);
		
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		int[] temp2 = arr;
		int temp3 = temp2[idx1];
		temp2[idx1] = temp2[idx2];
		temp2[idx2] = temp3;
		
		System.out.println("temp2[idx1] : " + temp2[idx1]);
		System.out.println("temp2[idx2] : " + temp2[idx2]);
		
	}
	
}


public class MethodEx06_연습 {

	public static void main(String[] args) {
		
		
			Ex06_연습 e = new Ex06_연습();
			
			// 문제 1) x부터 y까지의 합을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.test1(x, y);
			
			// 문제 2) arr배열을 전달받아 최대값을 출력하는 메서드
			int[] arr = {87, 100, 35, 12, 46};
			e.test2(arr);
			
			// 문제 3) arr배열과 idx1 , idx2를 전달받아 idx1번째와 idx2번째를 교체한뒤 출력하는 메서드
			int idx1 = 1;
			int idx2 = 4;
			e.test3(arr, idx1, idx2);
		

	}

}
