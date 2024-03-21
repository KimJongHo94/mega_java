package step7_01.objectArray;

import java.util.ArrayList;


public class ArrayListTestEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		System.out.println(list.size()); // 6
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(400);
		list2.add(500);
		list2.add(600);
		
		System.out.println(list2.size()); // 3
		
		list.addAll(list2);
		
		System.out.println(list);		// [100, 200, 300, 400, 500, 600]
		System.out.println(list.size()); // 6
		
		// 들어가 있는 배열 크기 중간 index에만 넣을 수 있음
		list.add(5, 1000);
		
		System.out.println(list);
		
		
		list.remove(2);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		ArrayList<String> list3 = new ArrayList<String>();
		
		list3.add("A");
		list3.add("B");
		list3.add("A");
		list3.add("C");
		
		System.out.println(list3.contains("A"));
		
		System.out.println(list3.indexOf("A"));
		
		System.out.println(list3.lastIndexOf("A"));
		
		list3.clear();
		
		list3.add("1");
		list3.add("2");
		list3.add("3");
		list3.add("4");
		
		System.out.println(list3.get(0));
		System.out.println(list3.get(3));
		
		list3.clear();
		
		list3.add("P");
		list3.add("r");
		list3.add("o");
		list3.add("g");
		list3.add("r");
		list3.add("a");
		list3.add("m");
		
		System.out.println(list3.subList(0, list3.size() - 1));
		System.out.println(list3.subList(3, list3.size()));
		System.out.println(list3.subList(0, list3.size()-1));
		
		list3.clear();
		
		list3.add("list3");
		list3.add("list3");
		list3.add("list3");
		
		list3.set(1, "setData");
		
		System.out.println(list3);
		
		list.clear();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		ArrayList<Integer> cloneNumber = (ArrayList<Integer>) list.clone();
		
		
		System.out.println("list : " + list);
		System.out.println("cloneNumber : " + cloneNumber);
		
		
		list3.clear();
		
		
		
	}

}
