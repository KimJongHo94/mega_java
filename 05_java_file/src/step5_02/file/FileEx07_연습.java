package step5_02.file;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileEx07_연습 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[] arrayList = null;
    int elementCnt = 0;

    String fileName = "arrayList.txt";

    while (true) {

      for (int i = 0; i < elementCnt; i++) {
        System.out.print(arrayList[i] + " ");
      }
      System.out.println();

      System.out.println("[어레이리스트 컨트롤러]");
      System.out.println("[1]추가하기");
      System.out.println("[2]삭제하기");
      System.out.println("[3]저장하기");
      System.out.println("[4]로드하기");
      System.out.println("[5]종료하기");

      System.out.print("메뉴 선택 : ");
      int sel = scan.nextInt();

      if      (sel == 1) {    // 추가하기

        // 등록 되어 있는 값이 없다면
        if (elementCnt == 0) {
          arrayList = new int[elementCnt + 1];
        }
        else if (elementCnt > 0) {
          int[] temp = arrayList;
          //System.out.println(Arrays.toString(arrayList) + "테스트");
          arrayList = new int[elementCnt + 1]; // arrayList 배열 초기화 후 배열 크기 1칸 늘리기
          //System.out.println(Arrays.toString(arrayList) + "테스트2");
          for (int i = 0; i < elementCnt; i++) {
            arrayList[i] = temp[i];
          }
          temp = null;
        }

        System.out.print("[추가] 데이터 입력 : ");
        int data = scan.nextInt();

        arrayList[elementCnt] = data;
        elementCnt++;

      }
      else if (sel == 2) {    // 삭제하기

        System.out.print("[삭제] 인덱스 입력 : ");
        int delIdx = scan.nextInt();

        if (elementCnt -1 < delIdx || delIdx < 0) {
          System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
          continue;
        }

        if (elementCnt == 1) {
          arrayList = null;
        }
        else if (elementCnt > 1) {
          int[] temp = arrayList;
          arrayList = new int[elementCnt - 1];

          int idx = 0;
          for (int i = 0; i < elementCnt; i++) {
            if (i != delIdx) {
              arrayList[idx] = temp[i];
              idx++;
            }
          }
          temp = null;
        }
        elementCnt--;

      }
      else if (sel == 3) {    // 저장하기

        String data = "";

        if (elementCnt > 0) {

          for (int i = 0; i < elementCnt; i++) {
            data += arrayList[i];
            data += "\n";
          }

          FileWriter fw = null;

          try {
            fw = new FileWriter(fileName);
            fw.write(data);
          } catch (Exception e) {

          } finally {
            try {
              fw.close();
            } catch (IOException e) {
              throw new RuntimeException(e);
            } finally {
            }
          }

        } else {
          System.out.println("[메세지]저장할 데이터가 없습니다.");
        }

      }
      else if (sel == 4) {   // 로드하기

        String data = "";
        File file = new File(fileName);

        if (file.exists()) {

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
              data += line;
              data += "\n";
            }
            data = data.substring(0, data.length() - 1);

            String[] temp = data.split("\n");
            elementCnt = temp.length;

            arrayList = new int[elementCnt];

            for (int i = 0; i < elementCnt; i++) {
              arrayList[i] = Integer.parseInt(temp[i]);
            }
            System.out.println(Arrays.toString(arrayList));

          } catch (Exception e) {

          } finally {

            try {
              br.close();
            } catch (IOException e) {
              throw new RuntimeException(e);
            }

            try {
              fr.close();
            } catch (IOException e) {
              throw new RuntimeException(e);
            }
          }

        } else {
          System.out.println("[메세지]파일이 존재하지 않습니다.");
        }

      }
      else if (sel == 5) {
        System.out.println("프로그램 종료");
        scan.close();
        break;
      }

    }
		
	}
}
