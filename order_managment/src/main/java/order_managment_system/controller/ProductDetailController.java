package order_managment_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import order_managment_system.entity.Product;
import order_managment_system.service.ProductDetailService;

@CrossOrigin
@RestController
public class ProductDetailController implements IProductDetailController {

	@Autowired
	private ProductDetailService productservice;

	@Override
	public Product add(@RequestBody Product product) {
		System.out.println("addProduct ... ");
		return productservice.add(product);
	}

	@Override
	public Product update(@RequestBody Product product) {
		return productservice.update(product);

	}

	@Override
	public String deletebyid(@RequestBody int id) {
		System.out.println("Contoller");
		 productservice.deletebyid(id);
        return "product deleted";
	}

	@Override
	public List<Product> getAllProducts() {
		System.out.println("controller ....");
		return productservice.getAllProducts();
	}

}
