package step5_02.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//# 파일 컨트롤러[2단계] : ATM

public class FileEx08_연습 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int atmSize = 5;
		int accsCnt = 0;
		int identifier = -1;
		
		String[] accs = new String[atmSize];
		String[]  pws = new String[atmSize];
		int[]  moneys = new int[atmSize];
		
		String fileName = "atm.txt";
		
		while(true) {
			
			for (int i = 0; i < accsCnt; i++) {
				System.out.println(i + "번 계정 : " + accs[i]);
			}
			System.out.println();
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {		// 회원가입
				
				if (identifier == -1) {
					
					if (accsCnt < atmSize) {
						
						System.out.println("=== 회원가입 ===");
						
						System.out.print("아이디 입력 : ");
						String getId = scan.next();
						System.out.print("비밀번호 입력 : ");
						String getPw = scan.next();
						
						int check = 0;
						
						for (int i = 0; i < accsCnt; i++) {
							if (getId.equals(accs[i])) {
								check = -1;
							}
						}
						
						if (check == 0) {
							accs[accsCnt] = getId;
							pws[accsCnt] = getPw;
							accsCnt++;
						} else {
							System.out.println("[메세지]중복된 계정입니다.");	
						}
						
					} else {
						System.out.println("[메세지] 더 이상 계정을 생성할 수 없습니다.");
						continue;
					}
					
				}
				else {
					System.out.println("[메세지]로그인 중에는 할 수 없습니다.");
				}
				
			}
			else if (sel == 2) {		// 회원탈퇴
			
				if (identifier == -1) {
					if (accsCnt > 0) {
						
						System.out.println("=== 회원탈퇴 ===");
						System.out.print("삭제하실 아이디 입력 : ");
						String delId = scan.next();
						
						boolean isCheckId = false;
						boolean isCheckPw = false;
						
						for (int i = 0; i < accsCnt; i++) {
							
							if (delId.equals(accs[i])) {
								isCheckId = true;
							}
							
						}
						
						if (isCheckId != false) {
							System.out.print("비밀번호 입력 : ");
							String delPw = scan.next();
							
							
							
							for (int i = 0; i < accsCnt; i++) {
								if (delPw.equals(pws[i])) {
									isCheckPw = true;
								}
							}
							
						} else {
							System.out.println("[메세지] 아이디를 확인해주세요.");
						}
						
						if (!isCheckPw) {
							
							if (accsCnt == 1) {
								accs = new String[atmSize];
								pws  = new String[atmSize];
								moneys = new int[atmSize];
							}
							else if (accsCnt > 1) {
								String[] temp1 = accs;
								String[] temp2 = pws;
								int[]    temp3 = moneys;
								
								for (int i = 0; i < accsCnt; i++) {
									
									if (!delId.equals(accs[i])) {
										temp1[i] = accs[i];
										temp2[i] = pws[i];
										temp3[i] = moneys[i];
									}
									
								}
								
								for (int i = 0; i < accsCnt; i++) {
									accs[i] = temp1[i];
									pws[i] = temp2[i];
									moneys[i] = temp3[i];
								}
								temp1 = null;
								temp2 = null;
								temp3 = null;
								
								accsCnt--;
								System.out.println("[메세지]정상적으로 회원탈퇴가 되었습니다.");
							}
							
						} else {
							System.out.println("[메세지] 비밀번호를 확인해주세요.");
						}
						
					} else {
						System.out.println("[메세지] 최소 한 개 이상의 계정이 등록이 되어있어야 합니다.");
					}
					
				}
				else {
					System.out.println("[메세지]로그인 중에서만 할 수 있습니다.");
				}
				
			}
			else if (sel == 3) {		// 로그인
				
				if (identifier == -1) {
					
					if (accsCnt > 0) {
						
						System.out.println("=== 로그인 ===");
						System.out.print("아이디 입력 : ");
						String getId = scan.next();
						System.out.print("비밀번호 입력 : ");
						String getPw = scan.next();
						
						boolean isCheckLogin = false;
						
						for (int i = 0; i < accsCnt; i++) {
							
							if (getId.equals(accs[i]) && getPw.equals(pws[i])) {
								isCheckLogin = true;
								identifier = i;
							}
							
						}
						
						if (isCheckLogin != false) {
							System.out.println("[메세지]" + getId + "님 환영합니다.");
						} else {
							System.out.println("[메세지]해당 계정은 등록이 안 되어 있습니다.");
						}
						
					}
					else {
						System.out.println("[메세지]등록 되어 있는 계정이 없습니다.");
					}
					
				}
				else {
					System.out.println("[메세지]로그인 중에서는 할 수 없습니다.");
				}
				
			}
			else if (sel == 4) {		// 로그아웃
				
				if (identifier != -1) {
					System.out.println("[메세지]정상적으로 로그아웃 되었습니다.");
					identifier = -1;
				}
				else {
					System.out.println("[메세지]로그인 상태가 아닙니다.");
				}
				
			}
			else if (sel == 5) {		// 입금
				
				if (identifier != -1) {
					
					System.out.println("=== 입금 ===");
					System.out.print("입금 금액 : ");
					int insertMoney = scan.nextInt();
					
					if (insertMoney > 0) {
						moneys[identifier] = insertMoney;
						System.out.println("[메세지]정상적으로 입금이 되었습니다.");
					}
					else {
						System.out.println("[메세지]입금하는 금액이 0원 이상 입력하세요.");
					}
					
				}
				else {
					System.out.println("[메세지]로그인 상태가 아닙니다.");
				}
				
			}
			else if (sel == 6) {		// 출금
				
				if (identifier != -1) {
					
					if (moneys[identifier] > 0) {
						
						System.out.println("=== 출금 ===");
						System.out.print("출금 금액 입력 : ");
						int withdrawMoney = scan.nextInt();
						
						if (withdrawMoney <= moneys[identifier]) {
							moneys[identifier] -= withdrawMoney;
							System.out.println("[메세지]정상적으로 출금 되었습니다.");
						}
						else {
							System.out.println("[메세지]보유하신 잔액보다 더 큰 금액을 입력하셨습니다.");
						}
						
					}
					else {
						System.out.println("[메세지]현재 잔액이 0원 입니다.");
					}
					
				}
				else {
					System.out.println("[메세지]로그인 상태가 아닙니다.");
				}
				
			}
			else if (sel == 7) {		// 이체
				
				if (identifier != -1) {
					
					System.out.println("=== 이체 ===");
					System.out.print("이체 계좌 입력 : ");
					String tossAcc = scan.next();
					
					boolean isCheckAcc = false;
					int getIdx = -1;
					
					for (int i = 0; i < accsCnt; i++) {
						if (tossAcc.equals(accs[i])) {
							isCheckAcc = true;
							getIdx = i;
						}
					}
					
					if (isCheckAcc != false) {
						
						System.out.print("이체 금액 입력 : ");
						int tossMoney = scan.nextInt();
						
						if (moneys[identifier] >= tossMoney) {
							moneys[identifier] -= tossMoney;
							moneys[getIdx] += tossMoney;
							System.out.println("[메세지]정상적으로 이체가 되었습니다.");
						}
						else {
							System.out.println("[메세지]보유하신 잔액보다 더 큰 금액을 입력하셨습니다.");
						}
						
					}
					else {
						System.out.println("[메세지]해당 계좌는 등록이 되어 있지 않습니다.");
					}
					
				}
				else {
					System.out.println("[메세지]로그인 상태가 아닙니다.");
				}
				
			}
			else if (sel == 8) {		// 잔액조회
				
				if (identifier != -1) {
					
					System.out.println(accs[identifier] + "님 보유금액 : " + moneys[identifier] + "원 입니다.");
					
				}
				else {
					System.out.println("[메세지]로그인 상태가 아닙니다.");
				}
				
			}
			else if (sel == 9) {		// 저장
				
				if (accsCnt > 0) {
					
					String data = "";
					
					File file = new File(fileName);
					FileWriter fw = null;
					
					try {
						fw = new FileWriter(file);
						
						for (int i = 0; i < accsCnt; i++) {
							
							data += accs[i];
							data += "/";
							data += pws[i];
							data += "/";
							data += Integer.toString(moneys[i]) + "\n";
							
						}
						
						fw.write(data);
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							fw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					
				}
				else {
					System.out.println("[메세지]최소 1건 이상의 계좌가 등록이 되어야합니다.");
				}
				
				
				
			}
			else if (sel == 10) {		// 로드
				
				File file = new File(fileName);
				
				if (file.exists()) {
					
					String outputData = "";
					
					FileReader fr = null;
					BufferedReader br = null;
					
					try {
						
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						while (true) {
							
							String line = br.readLine();
							if (line == null) {
								break;
							}
							outputData += line;
							outputData += "\n";
							
						}
						//System.out.println(outputData);;
						
						outputData = outputData.substring(0, outputData.length() - 1);
						
						//System.out.println(outputData);
						
						String[] temp = outputData.split("\n");
						
						//System.out.println(Arrays.toString(temp));
						
						for (int i = 0; i < temp.length; i++) {
							String[] temp2 = temp[i].split("/");
							System.out.println("계좌 : " + temp2[0] + ", 비번 : " + temp2[1] + ", 잔액 : " + temp2[2] + "원");
						}
						
					} catch (Exception e) {
						
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
				else {
					System.out.println("[메세지]등록 되어 있는 파일이 없습니다.");
				}
				
			}
			else if (sel == 0) {		// 종료
				System.out.println("=== ATM 종료 ===");
				break;
			}
			
		}
		
	}
}
