package step1_02.variable;

/*
 * 
 *  # 변수 ( variable )
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 *  
 * 
 * */


public class VariableEx01 {

	public static void main(String[] args) {
	
		// 1. 정수 : Integer(int)		
		int memberAge;  // 변수의 선언
		memberAge = 20; // 데이터 저장
		System.out.println(memberAge);
		
		// 2. 실수 : double
		double memberWeight = 80.7;
		System.out.println(memberWeight);
		
		
		// 3. 문자 1개 : character(char)
		char memberGenderEng = 'm';
		char memberGenderKor = '남';
		
		System.out.println(memberGenderEng);
		System.out.println(memberGenderKor);
		
		// 4. 문자열 : String
		String subjectName = "web development";
		System.out.println(subjectName);
		
		
		// 5. 참과 거짓 : boolean
		boolean isChecked = true;
		System.out.println(isChecked);
		
		// 변수의 특징 (고유성)
		int goodsPrice = 30000;
		//int goodsPrice = 33000; // 변수의 이름을 중복해서 생성 할 수 없다.
		
		goodsPrice = 33000; // 자료형을 생략했으므로 변수의 데이터를 수정(update)한다.
		goodsPrice = 35000;

		System.out.println(goodsPrice); // 가장 최근에 저장된 데이터 1개만 저장되어 있다.
		
		// 변수의 초깃값(reset (x) , init (o))
		int deliveryPrice;
		
		// 변수를 초기화하지 않으면 가비지 데이터가 변수에 저장되어 있다.
		//System.out.println(deliveryPrice);
		
		// int 타입은 일반적으로 0으로 초기화 
		int tax = 0;
		
	}

}
