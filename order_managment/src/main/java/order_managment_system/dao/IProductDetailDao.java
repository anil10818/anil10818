package order_managment_system.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import order_managment_system.entity.Product;

@Repository
public interface IProductDetailDao extends CrudRepository<Product, Integer> {




}
