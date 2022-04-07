package order_managment_system.service;

import order_managment_system.entity.User;

public interface IUserService {

	public User getAdminById(int id);

	
	public User update(User admin);

	public User add(User admin);


}
