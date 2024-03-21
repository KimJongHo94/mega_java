package step8_01.technique;

import java.util.ArrayList;

public interface TechniqueEx10_02 {
	
	// abstract 생략 가능
	public abstract void addProduct(ProductDTO productDTO);
	public abstract ArrayList<ProductDTO> getProductList();
	public abstract ProductDTO getProductDetail(int productCd);
	
	public void setProduct(ProductDTO productDTO);
	public void removeProductList(int[] productCdList);
	public void removeProductOne(int productCd);
	
}
