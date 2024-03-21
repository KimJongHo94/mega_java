package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;

// MyArrayList 만들기
class TestArrayList {

	int[] arr;
	int elementCnt;
	
	void print () {
		System.out.println(Arrays.toString(arr));
	}
	
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
			
			
			// ex) add(3, 5)
			// -> elementCnt = 4;
			/*
			 * for (int i = 0; i < 4 + 1; i++) {
			 * 
			 * 	if (i != 3) {
			 *  	1) arr[0] = temp[0];
			 *    2) arr[1] = temp[1];
			 *    3) arr[2] = temp[2];
			 *    
			 *  }
			 * 
			 * }
			 * 
			 * */
			
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
			for (int i = 0; i < elementCnt; i++) {
				if (i != index) {
					arr[idx++] = temp[i];
				}
			}
			temp = null;
		}
		elementCnt--;
		
	}
	
	int size () {
		return elementCnt;
	}
	
	int get (int index) {
		return arr[index];
	}
	
	void set (int index, int value) {
		arr[index] = value;
	}
	
	void clear () {
		arr = null;
		elementCnt = 0;
	}

}


public class ObjectArrayEx14_연습2 {

	public static void main(String[] args) {

		// [ ArrayList 사용 ] 
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// list : [10, 20, 30, 40, 50]
		System.out.println("list : " + list);
		
		// 삽입
		list.add(0, 9);
		
		// list : [9, 10, 20, 30, 40, 50]
		System.out.println("list : " + list);
		
		// 해당 index 삭제
		list.remove(3);
		
		// list : [9, 10, 20, 40, 50]
		System.out.println("list : " + list);
		
		// list 사이즈
		int elementCnt = list.size();
		
		// 5
		System.out.println("list.size() : " + list.size());
		
		// [9, 10, 20, 40, 50]
		System.out.print("[");
		for (int i = 0; i < elementCnt; i++) {
			System.out.print(list.get(i));
			if (i != elementCnt - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		// 값 바꾸기
		list.set(3, 5);
		
		// list : [9, 10, 20, 5, 50]
		System.out.println("list : " + list);
		
		list.clear();
		
		// []
		System.out.println("list : " + list);
		
		
		System.out.println("\n========================================\n");
		
		TestArrayList myList = new TestArrayList();
		
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		
		// [10, 20, 30, 40, 50]
		myList.print();
		
		myList.add(3, 35);
		// [10, 20, 30, 35, 40, 50]
		myList.print();
		
		myList.remove(3);
		// [10, 20, 30, 40, 50]
		myList.print();
		
		int elementCount = myList.size();
		System.out.println("elementCount : " + elementCount); // 5
		
		// [10, 20, 30, 40, 50]
		System.out.print("[");
		for (int i = 0; i < elementCount; i++) {
			System.out.print(myList.get(i));
			if (i != elementCount - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		myList.set(3, 25);
		// [10, 20, 30, 25, 50]
		myList.print();
		
		myList.clear();
		System.out.println(myList.size()); // 0
		
	}

}
