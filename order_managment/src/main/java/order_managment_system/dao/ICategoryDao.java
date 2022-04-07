package order_managment_system.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import order_managment_system.entity.Category;


@Repository
public interface ICategoryDao extends CrudRepository<Category,Integer> {

	
}
