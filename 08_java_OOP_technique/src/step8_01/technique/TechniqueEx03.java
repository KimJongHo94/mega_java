package step8_01.technique;
/*
   
	# static
 	
 	- 정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
 	- static 키워드를 통해 생성된 정적멤버들은 heap영역이 아닌 static영역에 할당한다.
 	- static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
 	- Garbage Collector의 관리 영역 밖에 존재하기에 static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.
 
 */

class Character {
	
	int hp = 100;
	static int moveSpeed = 10;
	
	void printData() {
		System.out.println("hp : " + hp);
		System.out.println("moveSpeed : " + moveSpeed);
		System.out.println();
	}
	
	static void speedUp() {
		moveSpeed += 1000;
	}
	
}


public class TechniqueEx03 {

	public static void main(String[] args) {
			
		Character c1 = new Character();
		c1.hp = 0;
		//c1.moveSpeed += 10;
		
		// 클래스명.static변수명으로 접근
		Character.moveSpeed += 10;
		
		//c1.speedUp();
		// 클래스명.static메소드명으로 접근
		Character.speedUp();
		
		Character c2 = new Character();
		c2.hp = 50;
		
		//c2.speedUp();
		
		Character c3 = new Character();
		
		
		c1.printData();
		c2.printData();
		c3.printData();
		
		System.out.println("\n===========================\n");
		
		// static 사용예시 
		System.out.println(Math.PI); // 상수의 변수명은 무조건 대문자
		System.out.println(Math.abs(-5));
		
		try {
			Thread.sleep(3000);		// 3초 대기
			System.out.println("끝");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			
		}
				
	}

}
