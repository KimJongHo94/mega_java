package step7_01.objectArray;

/*

	# 제네릭(Generic)
	
	- 클래스 내부에서 사용하는 데이터의 타입(Type)을 
	  클래스의 인스턴스를 생성할 때 결정하는 것을 의미한다.
	  
	- 객체의 타입을 컴파일 시점에 체크하기 때문에 
	  타입 안정성을 높이고 형 변환의 번거로움을 줄일 수 있다.

*/

class Employee {}
class Manager {}
class Supervisor {}

// 제네릭을 사용하지 않았을 경우
// 각 클래스별로 아래처럼 선언을 해야함

//class GenericEx1 {
//	Employee[] test1 = new Employee[1];
//}
//class GenericEx2 {
//	Manager[] test2 = new Manager[1];
//}
//class GenericEx3 {
//	Supervisor[] test3 = new Supervisor[1];
//}


// T : Type 약어(내 마음으로 작성)
// T는 this로 이해하기
class GenericEx<T> {
	
	Object[] arr = new Object[3];
	int idx = 0;
	
	void add(T data) {
		arr[idx] = data;
		idx++;
	}
	
	// T 제네릭 타입에 Employee 를 받아오면
	// T 는 Employee 
	T get(int index) {
		
		// 형변환
		return (T) arr[index];
	}
}

class GenericEx2<K, V> {}

public class ObjectArrayEx12 {

	public static void main(String[] args) {

		GenericEx<Employee>     employeeList   = new GenericEx<Employee>();		// 제네릭 타입 : Employee
		GenericEx<Manager>      managerList    = new GenericEx<Manager>();    // 제네릭 타입 : Manager
		GenericEx<Supervisor>  supervisorList  = new GenericEx<Supervisor>(); // 제네릭 타입 : Supervisor
		
		employeeList.add(new Employee());
//		employeeList.add(new Manager());
//		employeeList.add(new Supervisor());
		
//		managerList.add(new Employee());
		managerList.add(new Manager());
//		managerList.add(new Supervisor());
		
//		supervisorList.add(new Employee());
//		supervisorList.add(new Manager());
		supervisorList.add(new Supervisor());
		
		System.out.println(employeeList.get(0));		
		System.out.println(managerList.get(0));		
		System.out.println(supervisorList.get(0));	
		
		
		// 참고
		GenericEx2<String, Object> test = new GenericEx2<String, Object>();
	}

}
