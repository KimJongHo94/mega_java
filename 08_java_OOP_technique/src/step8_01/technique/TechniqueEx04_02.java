package step8_01.technique;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

// 생성자를 이용한 멤버변수 초기화

class GoodsDTO {
	
	String goodsCd;
	String goodsNm;
	int    goodsPrice;
	
	void setData(String goodsCd, String goodsNm, int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	
	//생성자 단축키 > 좌측 상단 Source > Generate Constructor Using Fields..
	GoodsDTO(String goodsCd, String goodsNm, int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	

	void printData() {
		System.out.println("goodsCd    : " + this.goodsCd);
		System.out.println("goodsNm    : " + this.goodsNm);
		System.out.println("goodsPrice : " + this.goodsPrice);
	}

	
	
}

public class TechniqueEx04_02 {

	public static void main(String[] args) {
		
		  // Before
//		GoodsDTO goodsDTO = new GoodsDTO(); // 오류내용) The constructor GoodsDTO() is undefined
//		goodsDTO.goodsCd = "0x001";
//		goodsDTO.goodsNm = "기계식키보드";
//		goodsDTO.goodsPrice = 45000;
//		goodsDTO.setData("0x001", "기계식키보드", 45000);
//		goodsDTO.printData();
		
		
		// After) 생성자를 사용한 객체(멤버)변수 초기화
		GoodsDTO goodsDTO1 = new GoodsDTO("0x001", "기계식키보드1", 45000);
		GoodsDTO goodsDTO2 = new GoodsDTO("0x002", "무선마우스",    50000);
		GoodsDTO goodsDTO3 = new GoodsDTO("0x003", "장패드",        70000);
		
		goodsDTO1.printData();
		System.out.println();
		goodsDTO2.printData();
		System.out.println();
		goodsDTO3.printData();
		
		// 사용예시
		Scanner scan         = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat df     = new DecimalFormat("#,##0");
	}

}
