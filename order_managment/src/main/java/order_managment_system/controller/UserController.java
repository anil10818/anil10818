package order_managment_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import order_managment_system.entity.User;
import order_managment_system.service.IUserService;


@CrossOrigin
@RestController
public class UserController implements IUserController {

	@Autowired
	private IUserService adminService;

	@Override
	public User add(@RequestBody User admin) {
		System.out.println("addAdmin method ... ");
		return adminService.add(admin);

	}

	public User getAdminById(int id) {

		return adminService.getAdminById(id);
	}
	
	

	public User update(User admin) {
		// TODO Auto-generated method stub
		return adminService.update(admin);

	}

	

}
