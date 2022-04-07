package order_managment_system.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import order_managment_system.entity.Product;


@RequestMapping({"/ProductDetail"})
public interface IProductDetailController {

	@PostMapping("/add")
	public Product add (Product product);

	@PutMapping("/update")
	public Product update(Product product); 

	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable int id);
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts();


}