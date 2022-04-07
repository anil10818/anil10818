package order_managment_system.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import order_managment_system.entity.User;


@Repository
public interface IUserDao extends CrudRepository<User, Integer>  {

}
