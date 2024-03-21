package step9_04.student;

public class StudentVO {
	
	private String id;
	private int num;
	private String name;
	
	// 생성자
	// 파라미터 : id, num, name
	public StudentVO(String id , int num , String name) {
		this.id = id;
		this.num = num;
		this.name = name;
	}	
	
	public void printOneInfo() {
		System.out.println("id: " + this.id + " / num: " + this.num + " / name: " + this.name);
	}
	
	// Getter / Setter
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
