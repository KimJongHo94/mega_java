package step8_01.technique;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */

class GoodsVO {
	
	String goodsCd;
	String goodsNm;
	int    price;
	
	// 생성자 오버로딩(중복 정의)
	GoodsVO() {
		this.goodsCd = "없음";
		this.goodsNm = "없음";
		this.price   = -999;
	}
	
	//생성자 오버로딩(중복 정의)
	GoodsVO(String goodsCd) {
		this.goodsCd = goodsCd;
		this.goodsNm = "없음";
		this.price   = -999;
	}
	
	//생성자 오버로딩(중복 정의)
	GoodsVO(String goodsCd, String goodsNm) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.price   = -999;
	}
	
  //생성자 오버로딩(중복 정의)	
	GoodsVO(String goodsCd, String goodsNm, int price) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.price   = price;
	}
	
	void printData() {
		System.out.println(this.goodsCd + " / " + this.goodsNm + " / " + this.price + "\n");
	}
}


public class TechniqueEx04_03 {

	public static void main(String[] args) {
		
		//GoodsVO vo = new GoodsVO();
		
		GoodsVO vo1 = new GoodsVO();
		GoodsVO vo2 = new GoodsVO("0x001");
		GoodsVO vo3 = new GoodsVO("0x002", "기계식키보드");
		GoodsVO vo4 = new GoodsVO("0x003", "무선마우스", 27000);
		
		vo1.printData();
		vo2.printData();
		vo3.printData();
		vo4.printData();
		
		System.out.println("\n=============================\n");
		
		// 사용예시
		new SimpleDateFormat();
		new SimpleDateFormat("yyyy-MM-dd");
		
		new DecimalFormat();
		new DecimalFormat("#,##0");
	}

}
