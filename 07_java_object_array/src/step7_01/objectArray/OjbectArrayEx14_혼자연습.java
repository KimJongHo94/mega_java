package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;

class Ex14_연습 {
	
	int[] arr;
	int elementCnt = 0;
	
	void add (int value) {
		
		if (elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[elementCnt] = value;
		elementCnt++;
		
	}
	
	void add (int index, int value) {
		
		if (elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			int idx = 0;
			for (int i = 0; i < elementCnt + 1; i++) {
				if (i != index) {
					arr[i] = temp[idx++];
				}
			}
			temp = null;
		}
		arr[index] = value;
		elementCnt++;
		
	}
	
	void remove (int index) {
		
		if (elementCnt == 0) {
			arr = null;
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt - 1];
			
			int idx = 0;
		}
		
	}
	
	void print () {
		System.out.println(Arrays.toString(arr));
	}
	
}

public class OjbectArrayEx14_혼자연습 {

	public static void main(String[] args) {
		
		// [ ArrayList 사용 ]
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 추가하기
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);	
		System.out.println(list);
		
		// 삽입하기
		list.add(0, 9);
		System.out.println(list);
		
		// (index로) 삭제하기
		list.remove(0);
		System.out.println(list);
		
		// 길이 구하기
		int elementCount = list.size();
		System.out.println(elementCount);
		
		// (index로)값 꺼내오기
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// 특정 위치의 값 수정하기
		list.set(1, 25);
		System.out.println(list);
		
		// 모든 데이터를 제거하기
		list.clear();
		System.out.println(list);
		
		System.out.println("\n========================================\n");
		
		Ex14_연습 myList = new Ex14_연습();
		
		// 추가하기
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		
		// [10, 20, 30, 40, 50]
		myList.print();
		
		// 삽입하기
		myList.add(0, 9);
		// [9, 10, 20, 30, 40, 50]
		myList.print();
		
		// (index로) 삭제하기
		
	}

}
