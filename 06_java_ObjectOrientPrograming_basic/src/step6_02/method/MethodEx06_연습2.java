package step6_02.method;

import java.util.Arrays;

class Ex06_연습2 {
	
	void test1(int x, int y) {
		
		int sum = 0;
		
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		
		System.out.println("sum = " + sum);
		
	}
	
	void test2(int[] arr) {
		
		int[] temp = arr;
		//System.out.println(Arrays.toString(temp));
		
		int maxNum = 0;
		
		for (int i = 0; i < temp.length; i++) {
			if (maxNum < temp[i]) {
				maxNum = temp[i];
			}
		}
		
		System.out.println("최대값 : " + maxNum);
		
	}
	
	void test3(int[] arr, int idx1, int idx2) {
		
		int[] temp = arr;
		
		int temp2 = temp[idx1];
		temp[idx1] = temp[idx2];
		temp[idx2] = temp2;
		
		System.out.println(Arrays.toString(temp));
	}
	
}


public class MethodEx06_연습2 {

	public static void main(String[] args) {
		
		
		Ex06_연습2 e = new Ex06_연습2();
		
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
