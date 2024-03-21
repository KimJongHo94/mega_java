package step7_01.objectArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentEx_연습 {
	String id;
	String pw;
	
	void printData() {
		System.out.println("ID : " + id + ", PW : " + pw);
	}
}

class Controller_연습 {
	
	StudentEx_연습[] list = null;
	int stdCnt = 0;
	
	void addStudentEx (StudentEx_연습 st) {
		
		if (stdCnt == 0) {
			list = new StudentEx_연습[1]; // 생성된 계정이 없으면 객체 배열 초기화
		}
		else if (stdCnt > 0) {
			
			StudentEx_연습[] temp = list; // 기존 list 클래스 배열에 담아있던 값 temp 클래스 배열에 담기
			list = new StudentEx_연습[stdCnt + 1]; // 기존 list 클래스 배열 값에서 한 칸 더 큰 클래스 배열로 초기화
			
			for (int i = 0; i < stdCnt; i++) {
				list[i] = temp[i];
			}
			temp = null; // 다 사용했으니 날리기
			
		}
		list[stdCnt] = st;
		stdCnt++;
		
	}
	
	StudentEx_연습 removeStudentEx (int index) {
		
		StudentEx_연습 delObj = list[index];
		
		if (stdCnt == 0) {
			list = null;
		}
		else if (stdCnt > 0) {
			
			StudentEx_연습[] temp = list;
			list = new StudentEx_연습[stdCnt - 1];
			
			for (int i = 0; i < index; i++) {	
				list[i] = temp[i];
			}
			for (int i = index; i < stdCnt - 1; i++) {
				list[i] = temp[i + 1];
			}
			temp = null;
			
		}
		stdCnt--;
		
		return delObj;
		
		
		
	}
	
	int checkId (StudentEx_연습 st) {
		
		int check = -1;
		
		for (int i = 0; i < stdCnt; i++) {
			if (list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
			
		return check;
		
	}
	
	void printSutdentEx () {
		
		for (int i = 0; i < stdCnt; i++) {
			list[i].printData();
		}
		
	}
	
	String outData () {
		
		String data = "";
		
		if (stdCnt == 0) {
			return data;
		}
		data += stdCnt;
		data += "\n";
		for (int i = 0; i < stdCnt; i++) {
			data += list[i].id;
			data += ",";
			data += list[i].pw;
			if (stdCnt - 1 != i) {
				data += "\n";
			}
		}
		return data;
		
	}
	
	void sortData () {
		
		for (int i = 0; i < stdCnt; i++) {
			for (int j = i; j < stdCnt; j++) {
				if (list[i].id.compareTo(list[j].id) > 0) {
					StudentEx_연습 temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				} 
			}
		}
		
	}
	
	void loadStudentEx (StudentEx_연습[] temp, int count) {
		this.stdCnt = count;
		this.list = temp;
	}
	
}



public class ObjectArrayEx09_연습2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller_연습 controller = new Controller_연습();
		
		String fileName = "student_db.txt";
		
		while (true) {
			
			System.out.println("[1]가입");
			System.out.println("[2]탈퇴");
			System.out.println("[3]정렬");
			System.out.println("[4]출력");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[7]종료");
			System.out.print("선택 >>>");
			int sel = scan.nextInt();
			
			if (sel == 1) { // 가입
				
				StudentEx_연습 temp = new StudentEx_연습(); // 객체 생성
				System.out.print("[가입]ID 입력 : ");
				temp.id = scan.next();
				
				int check = controller.checkId(temp); // 중복계정 체크
				
				if (check == -1) { // 중복 계정이 없다면
					
					System.out.print("[가입]PW 입력 : ");
					temp.pw = scan.next();
					
					controller.addStudentEx(temp);
					System.out.println("=== 회원가입 성공 ===");
					System.out.println(temp.id + "님 환영합니다!");
					
				}
				else {
					System.out.println("[메세지]중복된 계정입니다.");
				}
				
			}
			else if (sel == 2) {		// 탈퇴
				
				if (controller.stdCnt == 0) {
					System.out.println("[메세지]생성된 계정이 없습니다.");
					continue;
				}
				
				controller.printSutdentEx();
				
				StudentEx_연습 temp = new StudentEx_연습();
				
				System.out.print("[탈퇴]ID 입력 : ");
				temp.id = scan.next();
				
				int check = controller.checkId(temp);
				
				if (check == -1) {
					System.out.println("[메세지]해당 계정은 존재하지 않습니다.");
				}
				else {
					
					StudentEx_연습 delObj = controller.removeStudentEx(check);
					System.out.println(delObj.id + "님 탈퇴되었습니다.");
				}
				
			}
			else if (sel == 3) {		// 정렬
				
				if (controller.stdCnt == 0) {
					System.out.println("[메세지]생성된 계정이 없습니다.");
					continue;
				}
				
				controller.sortData();
				
				System.out.println("[메세지]정렬 처리 되었습니다.");
				
			}
			else if (sel == 4) {		// 출력
				controller.printSutdentEx();
			}
			else if (sel == 5) {		// 저장
				
				if (controller.stdCnt == 0) {
					System.out.println("[메세지]생성된 계정이 없습니다.");
					continue;
				}
				
				FileWriter fw = null;
				
				try {
					
					fw = new FileWriter(fileName);
					String data = controller.outData();
					
					if (!data.equals("")) {
						fw.write(data);
						System.out.println(data);
					}
					
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			}
			else if (sel == 6) {
				
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					
					File file = new File(fileName);
					
					if (file.exists()) {
						
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						String line = br.readLine();
						int count = Integer.parseInt(line);
						StudentEx_연습[] temp = new StudentEx_연습[count];
						
						for (int i = 0; i < count; i++) {
							temp[i] = new StudentEx_연습();
							line = br.readLine();
							String[] value = line.split(",");
							temp[i].id = value[0];
							temp[i].pw = value[1];
						}
						
						controller.loadStudentEx(temp, count);
						
					}
					
					controller.printSutdentEx();
					
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			else if (sel == 7) {
				System.out.println("=== 종료 ===");
				break;
			}
			else {
				System.out.println("1 ~ 7번 중에 선택하세요");
				continue;
			}
			
		}
		
		scan.close();
		
	}

}
