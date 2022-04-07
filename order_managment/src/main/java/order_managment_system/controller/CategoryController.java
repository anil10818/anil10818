package order_managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import order_managment_system.entity.Category;
import order_managment_system.service.ICategoryService;


@CrossOrigin
@RestController
public class CategoryController implements ICategoryController{
	
	@Autowired
	private ICategoryService categoryService;
	
	
	
	@Override
	public Category add(@RequestBody Category category) {
		System.out.println("addCategory ... ");
		return categoryService.add(category);
	}
 
	@Override
	public Category update(@RequestBody Category category)
	{
		return categoryService.update(category);
		
	}

  @Override
 public String deletebyid(@RequestBody  int id) {
		 categoryService.deletebyid(id);
		 return "category deleted";
	}

	
}	


