package order_managment_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import order_managment_system.dao.ICategoryDao;
import order_managment_system.entity.Category;

@Service
public class CategoryService  implements ICategoryService{

	@Autowired
	private ICategoryDao categoryDao; 
	
	@Override 
	 public Category add(Category category) {
		return categoryDao.save(category); 
	}
	
	
	@Override
	public Category update(Category category)
	{
	return categoryDao.save(category);
	}

	
	@Override
	public void deletebyid(int id)
	{
	 categoryDao.deleteById(id);
	}

	
	}


