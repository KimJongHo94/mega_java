package step8_01.technique;

/*
 * 
 *  # 상속 (Inheritance) 
 *  
 *  - 클래스 사이 부모 자식 관계를 설정해서 프로퍼티(필드) 및 메서드를 상속 및 확장하여 사용할 수 있다.
 *  
 *  - [ 호칭 ]  
 *  
 *  	부모 클래스, 상위 클래스, 슈퍼 클래스, 기반 클래스
 *     ----------------------------------------------------- 
 *  	자녀 클래스, 하위 클래스, 서브 클래스, 파생 클래스
 *
 *  - [ 형식 ]
 * 
 *   	class 자식클래스 extends 부모클래스 {
 *   
 *   	}
 *   
 *  - 모든 클래스는 Object클래스를 상속받는다.
 *  
 *  - 단일 상속만 가능하다. ( 다중상속 불가 )
 *    Ex) Class A extends B,C,D,E  (불가능)
 *
 *  - Class A {}
 *    Class B extends A {}
 *    Class C extends B {}
 *    
 *    위와 같은 형태로 상속을 받을 수는 있으나 클래스간의 의존성을 높이며 유지보수의 효율의 저하를 가져오므로 사용을 권장하지 않는다.
 *    
 * */

class Beginner {
	
	int level = 1;
	int power = 10;
	int dex = 10;
	int life = 10;
	int mana = 10;
	
	void levelUp() {
		this.level++;
		this.power += 10;
		this.dex   += 10;
		this.life  += 10;
		this.mana  += 10;
		
	}
	
	void printData() {
		System.out.println("level : " + this.level);
		System.out.println("power : " + this.power);
		System.out.println("dex   : " + this.dex);
		System.out.println("life  : " + this.life);
		System.out.println("mana  : " + this.mana);
		System.out.println();
	}
	
}

class Wizard extends Beginner {
	
}

class Warrior extends Beginner {
	
}


public class TechniqueEx06 {

	public static void main(String[] args) {
		
		Wizard wizard = new Wizard();
		wizard.printData();
		wizard.levelUp();
		wizard.levelUp();
		wizard.levelUp();
		wizard.printData();
		
		System.out.println("\n========================\n");
		
		Warrior warrior = new Warrior();
		warrior.printData();
		warrior.levelUp();
		warrior.printData();
	}

}
