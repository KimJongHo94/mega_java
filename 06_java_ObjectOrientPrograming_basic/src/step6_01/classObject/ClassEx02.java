package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */

class Product {
	
	String productCode;
	String productName;
	int    productPrice;
	int    deliveryPrice = 3000;		// 필드에 초기값 대입이 가능하다.
	
}

public class ClassEx02 {

	public static void main(String[] args) {
		
		// 같은 패키지안의 클래스는 다른 클래스에서 사용이 가능하다.
		Member member1 = new Member();
		
		Product product = new Product();
		
		product.productCode = "1234567";
		product.productName = "고구마";
		product.productPrice = 5000;
		
		System.out.println("product 객체 : " + product);
		System.out.println("product.productCode   : " + product.productCode);
		System.out.println("product.productName   : " + product.productName);
		System.out.println("product.productPrice  : " + product.productPrice);
		System.out.println("product.deliveryPrice : " + product.deliveryPrice);
		
		
	}

}
