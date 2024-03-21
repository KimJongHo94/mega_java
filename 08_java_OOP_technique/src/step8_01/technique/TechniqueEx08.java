package step8_01.technique;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this.변수  : 자신의 변수
 *    super.변수 : 부모의 변수
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */

class Parent {
	
	String name = "parent";
	int age     = 70;
	
	
	Parent() {
		this("익명", -1);
		System.out.println("(P-기본) 부모클래스의 기본생성자 실행");
	}
	
	Parent(String name, int age) {
		System.out.println("(P-추가) 부모클래스의 추가된 기본생성자 실행");
	}
	
	void testMethod() {
		System.out.println("(P)부모클래스 메서드");
	}
	
}

class Child extends Parent {
	
	String name = "child";
	int age     = 40;

	
	Child() {
		super();	// 부모클래스의 기본생성자를 실행 (기본적으로 생략되어 있다.)
		//super("익명부모", -999); // 부모클래스의 추가된 생성자를 실행
		System.out.println("(C-기본) 자녀클래스의 기본생성자 실행");
	}
	
	Child(String name, int age) {
		this();  
//		super(); // -> Parent();
//		super("익명부모2", -9999); // -> Parent(String name, int age);
		System.out.println("(C-추가) 자녀클래스의 추가된 기본생성자 실행");
	}
	
	// 메서드 오버라이딩(메서드 재정의)
	void testMethod() {
		System.out.println("(C)자녀클래스 메서드");
	}
	
	void printData() {
		System.out.println("=== 부모 클래스 ===");
		System.out.println(super.name); // 부모클래스의 변수
		System.out.println(super.age);  // 부모클래스의 변수
		System.out.println();
		
		System.out.println("=== 자녀 클래스 ===");
		System.out.println(this.name + " / " + name); // 자신의 변수
		System.out.println(this.age  + " / " + age);  // 자신의 변수
		System.out.println();
		
		super.testMethod(); // 부모클래스 testMethod 호출
		this.testMethod();  // 자신의 testMethod 호출
		testMethod();       // 자신의 testMethod 호출 (this는 보통 생략한다.)
	}
	
}

public class TechniqueEx08 {

	public static void main(String[] args) {
		
		new Parent();
		System.out.println("\n=====================================\n");
		new Child();
		System.out.println("\n=====================================\n");
		new Parent("익명부모", 60);
		System.out.println("\n=====================================\n");
		new Child("익명자녀", -999);
		
		System.out.println("\n=====================================\n");
		
		Child object = new Child("익명자녀", 40);
		System.out.println();
		object.printData();
		
	}

}
