 	package order_managment_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import order_managment_system.dao.IUserDao;
//import com.myproject.Dao.IUserDao;
import order_managment_system.entity.User;

@Service
public class UserService implements IUserService{
	
	

	@Autowired
	private IUserDao adminDao; 
	
	@Override
	public User add(User admin) {
		return adminDao.save(admin); 
	}

	@Override
	public User getAdminById(int id) {
		return adminDao.findById(id).get();
	}

	@Override
	public User update(User admin) {
		// TODO Auto-generated method stub
		return adminDao.save(admin);
	
	}

	
}
