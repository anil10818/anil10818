package order_managment_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import order_managment_system.dao.IProductDetailDao;
import order_managment_system.entity.Product;

@ComponentScan
@Service
public class ProductDetailService implements IProductDetailService {

	@Autowired
	private IProductDetailDao productDetailDao;

	
	@Override
	public Product add(Product product) {
		return productDetailDao.save(product);
	}

	@Override
	public Product update(Product product) {

		return productDetailDao.save(product);
	}

	@Override
	public void deletebyid(int id) {
		System.out.println("Service");
		 productDetailDao.deleteById(id);
		 
	}

	@Override
	public List<Product> getAllProducts() {
		System.out.println("service...........");
		return (List<Product>) productDetailDao.findAll();
	}
	

	
	
}
