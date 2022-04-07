package order_managment_system.service;

import order_managment_system.entity.Category;

public interface ICategoryService {

	public Category update(Category category);

	public Category add(Category category);

	public void deletebyid(int id);

}
