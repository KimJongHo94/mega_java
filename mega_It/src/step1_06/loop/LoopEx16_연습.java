package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 * 
 * 
 */

public class LoopEx16_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// -10~10 사이의 랜덤 숫자 2개를 저장
		int rNum1 = ran.nextInt(21) - 10; // [0 ~ 20] - 10 -> [-10 ~ 10]
		int rNum2 = ran.nextInt(21) - 10;
		
		
		// 목적지(destination)
		int desX = 0;
		int desY = 0;
		
		// 랜덤 숫자 2개를 목적지로 설정
		desX = rNum1;
		desY = rNum2;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("= 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) { // 방향설정
				
				// (동, 서) : x축, (남, 북) : y축 
				System.out.print("동(1)서(2)남(3)북(4) 어디로 이동하시겠습니까? : ");
				int choiceDir = scan.nextInt();
				
				if (1 <= choiceDir && choiceDir <= 4) {
					dir = choiceDir;
				} else {
					System.out.println("동, 서, 남, 북 중에서 고르시오");
					continue;
				}
				
				
				
			}
			else if (selectMenu == 2) { // 속도설정
				
				System.out.print("속도 1 ~ 3 중에 선택하세요 : ");
				int choiceSpeed = scan.nextInt();
				
				if (1 <=choiceSpeed && choiceSpeed <= 3) {
					speed = choiceSpeed;
				} else {
					System.out.println("설정하실 수 있는 속도 범위를 초과하셨습니다.");
					continue;
				}
				
			}
			else if (selectMenu == 3) { // 3. 이동하기
				
				if (dir != 0 || speed != 0) { // 방향 및 속도 입력했는지 체크
					
					if (dir == 1) { // 동
						x += speed;
					} else if (dir == 2) { // 서
						x = x + (speed * -1);
					} else if (dir == 3) { // 남
						y = y + (speed * -1);
					} else if (dir == 4) { // 북
						y += speed;
					}
					
					if (x == desX && y == desY) {
						int totalMove = (Math.abs(desX) + Math.abs(desY));
						
						if (totalMove % 2 == 1) {
							totalMove = (Math.abs(desX) + Math.abs(desY)) + 1;
						}
						
						fee = (totalMove / 2) * 50;
						System.out.println("도착하셨습니다.");
						System.out.println("총 이동거리 : " + totalMove);
						System.out.println("발생하신 요금은 : " + fee + "원 입니다.");
						isRun = false;
					}
					
				} else {
					System.out.println("방향을 먼저 선택해주세요.");
					continue;
				}
				
			}
			
		}
		scan.close();

	}

}
