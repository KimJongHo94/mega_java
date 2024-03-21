package step7_01.objectArray;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		HashMap<String, Object> exMap01 = new HashMap<String, Object>();
		
		exMap01.put("테스트1", 1234);
		exMap01.put("테스트2", true);
		exMap01.put("테스트3", '3');
		exMap01.put("테스트4", "테스트");
		exMap01.put("테스트5", 3.14);
		
		System.out.println("exMap01 : " + exMap01);
		
		System.out.println("\n=============\n");
		
		System.out.println("exMap01.size() : " + exMap01.size() + "개");
		
		System.out.println("\n=============\n");
		
		System.out.println(exMap01.get("테스트1"));
		
		System.out.println("\n=============\n");
		
		for (String map : exMap01.keySet()) {
			System.out.println("key : " + map + " value : " + exMap01.get(map));
		}
		System.out.println("\n=============\n");
		
		exMap01.remove("테스트1");
		System.out.println(exMap01);
		
		System.out.println("\n=============\n");
		
		
	}

}
