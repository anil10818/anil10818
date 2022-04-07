package order_managment_system.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import order_managment_system.entity.Category;



@RequestMapping("/Category")
public interface ICategoryController {

	@PostMapping("/add")
	public Category add(Category category);

	@PutMapping("/update")
	public Category update( Category category);
	
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable int id);

	

}
