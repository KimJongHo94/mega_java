package step8_01.technique;

/*

	# 메서드 오버라이딩 ( Method Overriding )
	
	- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
	- 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다.
	- 객체지향 기법의 다형성(polymorphism)을 구현하는 핵심기능이다.
	- 메서드 오버로딩과 혼용되기 쉽다.
	
	     메서드 오버라이딩 : 부모클래스와 자녀클래스 사이의 메서드이름이 같음(재 정의)
	     메서드 오버로딩   : 같은 클래스 안에서 메서드이름이 같음(중복 정의)

*/

class Wizard2 extends Beginner {
	
	// 메서드 오버라이딩(메서드 재정의)
	// 부모클래스와 메서드 이름이 같고 구현되는 기능이 다르다.
	void levelUp() {
		this.level++;
		this.mana += 3000;
		this.life += 100;
		this.dex  += 100;
		this.power += 5;
	}
	
	// Wizard2 클래스만의 메서드 추가
	void fireBall() {
		System.out.println("Wizard2 - fireBall 메서드 호출");
	}
	
}

class Warrior2 extends Beginner {
	
  //메서드 오버라이딩(메서드 재정의)
	// 부모클래스와 메서드 이름이 같고 구현되는 기능이 다르다.
	void levelUp() {
		this.level++;
		this.life  += 3000;
		this.mana  += 100;
		this.dex   += 100;
		this.power += 500;
	}
	
	void dash() {
		System.out.println("Warrior2 - dash 메서드 호출");
	}
	
}

public class TechniqueEx07 {

	public static void main(String[] args) {
		
		Wizard2 wizard2 = new Wizard2();
		System.out.println("=== 마법사 ===");
		wizard2.printData();
		wizard2.levelUp();
		wizard2.levelUp();
		wizard2.levelUp();
		wizard2.fireBall();
		wizard2.printData();
		
		System.out.println("============================\n");
		
		Warrior2 warrior2 = new Warrior2();
		System.out.println("=== 전 사 ===");
		warrior2.printData();
		warrior2.levelUp();
		warrior2.levelUp();
		warrior2.levelUp();
		warrior2.dash();
		warrior2.printData();
		
	}

}
