package order_managment_system.service;

import java.util.List;

import order_managment_system.entity.Product;


public interface IProductDetailService {

	Product update(Product product);

	void deletebyid(int id);

	Product add(Product product);
	
	public List<Product> getAllProducts();

	

	

}
