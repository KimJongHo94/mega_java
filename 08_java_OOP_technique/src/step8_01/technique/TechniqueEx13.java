package step8_01.technique;

import java.util.ArrayList;

/*
 * 
 * # toString : 객체에 관한 정보를 문자열로 반환한다.
 * 
 * */

class OrderDTO {
	
	private String orderId;
	private String goodsId;
	private String memberId;
	private String goodsTitle;
	private String deliveryMethod;
	private String deliveryAddress;
	private String deliveryMessage;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getGoodsTitle() {
		return goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getDeliveryMessage() {
		return deliveryMessage;
	}
	public void setDeliveryMessage(String deliveryMessage) {
		this.deliveryMessage = deliveryMessage;
	}
	
	
	// toString 생성 단축키
	// 좌측 상단 Source > Generate toString > Generate
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", goodsId=" + goodsId + ", memberId=" + memberId + ", goodsTitle="
				+ goodsTitle + ", deliveryMethod=" + deliveryMethod + ", deliveryAddress=" + deliveryAddress
				+ ", deliveryMessage=" + deliveryMessage + "]";
	}
	
}

public class TechniqueEx13 {

	public static void main(String[] args) {
		
		OrderDTO order1 = new OrderDTO();
		order1.setOrderId("order1");
		order1.setGoodsId("goods1");
		order1.setMemberId("member1");
		order1.setGoodsTitle("스프링문법");
		order1.setDeliveryMethod("택배수령");
		order1.setDeliveryAddress("테헤란로");
		order1.setDeliveryMessage("경비실 앞에 맡겨주세요.");
		
		// Before
		System.out.println("=== get 예제 ===");
		System.out.println(order1.getOrderId());
		System.out.println(order1.getGoodsId());
		System.out.println(order1.getMemberId());
		
		System.out.println("\n===============================\n");
		
		// After
		System.out.println("=== toString 예제 ===");
		System.out.println(order1); 
		
		System.out.println("\n===============================\n");
		
		OrderDTO order2 = new OrderDTO();
		order2.setOrderId("order2");
		order2.setGoodsId("goods2");
		order2.setMemberId("member2");
		order2.setGoodsTitle("JSP문법");
		order2.setDeliveryAddress("삼성동");
		order2.setDeliveryMethod("편의점");
		order2.setDeliveryMessage("배송전 연락주세요.");
		
		System.out.println(order2);
		
		System.out.println("\n===============================\n");
		
		ArrayList<OrderDTO> orderList = new ArrayList<OrderDTO>();
		for (int i = 0; i < 10; i++) {
			OrderDTO temp = new OrderDTO();
			temp.setOrderId("주문테스트" + i);
			temp.setGoodsId("상품테스트" + i);
			temp.setMemberId("멤버테스트" +  i);
			temp.setGoodsTitle("JSP문법");
			temp.setDeliveryAddress("삼성동");
			temp.setDeliveryMethod("편의점");
			temp.setDeliveryMessage("배송전 연락주세요.");
			orderList.add(temp);
		}
		
		System.out.println(orderList);
		
		System.out.println("\n===============================\n");
		
		for (OrderDTO orderDTO : orderList) {
			System.out.println(orderDTO);
		}
	}

}
