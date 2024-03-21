package step7_01.objectArray;

import java.util.ArrayList;

//class Tv {
//	
//	String name;
//	String brand;
//	int price;
//
//	void setData(String name, String brand, int price) {
//		this.name = name;
//		this.brand = brand;
//		this.price = price;
//	}
//	
//}


public class ObjectArrayEx13_연습2 {

	public static void main(String[] args) {
		
		ArrayList<Tv> list = new ArrayList<Tv>();
		
		Tv temp = new Tv();
		temp.setData("TV", "삼성", 1000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("스마트TV", "LG", 2000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("벽걸이TV", "애플", 3000);
		list.add(temp);
		
		list.remove(1);
		
		for (Tv tv : list) {
			System.out.println(tv.name + " / " + tv.brand + " / " + tv.price + "원");
		}

	}

}
