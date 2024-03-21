package step6_02.method;

// 다양한 변수의 종류

class VariableEx {
	
	int a;										// 객체변수, 인스턴스변수 (객체에서 사용하는 변수)
	static int b; 						// 클래스 변수 (클래스에서 사용하는 변수)
	
	void testMethod(int c) {	// 매개 변수 (메서드로 전달되는 데이터를 받을 때 사용하는 변수)
		int d;									// 지역 변수 (메서드 내부에서 사용하는 변수)
		
		this.a = c;
	}
	
}

// this : 객체(오브젝트, 인스턴스) 자신
class Zealot {
	
	int shield = 60;
	int hp = 100;
	
	void printStatus() {
		
		// this는 생략이 가능하고 기본적으로 생략되어 있다.
		System.out.println("this : " + this);
		System.out.println("shield : " + this.shield);
		System.out.println("hp     : " + this.hp);
		System.out.println();
	}
	
}

public class MethodEx04 {

	public static void main(String[] args) {
		
		Zealot z1 = new Zealot();
		System.out.println("z1 : " + z1);
		z1.shield = 50;
		z1.printStatus();
		
		Zealot z2 = new Zealot();
		System.out.println("z2 : " + z2);
		z2.shield = 0;
		z2.hp = 0;
		z2.printStatus();
		
		Zealot z3 = new Zealot();
		System.out.println("z3 : " + z3);
		z3.printStatus();
		
	}

}
