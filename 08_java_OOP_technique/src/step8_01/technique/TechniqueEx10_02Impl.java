package step8_01.technique;

import java.util.ArrayList;

/*
 *  > 인터페이스를 구현하는 클래스는 인터페이스 이름 + Impl(implements)를 추가하여 클래스명을 작성한다.
 *  
 *  ex) AdminOrderDAO     > AdminOrderDAOImpl
 *  	AdminGoodsService > AdminGoodsServiceImpl
 *  
 *  > 클래스 생성시 [interface]에서 Add클릭
 *  > 구현할 인터페이스를 검색하여 선택 후 클래스 생성
 */


class TechniqueEx10_02Impl implements TechniqueEx10_02 {

	@Override
	public void addProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<ProductDTO> getProductList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO getProductDetail(int productCd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeProductList(int[] productCdList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeProductOne(int productCd) {
		// TODO Auto-generated method stub

	}

}
