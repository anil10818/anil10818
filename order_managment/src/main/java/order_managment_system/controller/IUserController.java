package order_managment_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import order_managment_system.entity.User;


@RequestMapping("/Admin")
public interface IUserController {

	@PostMapping("/add")
	public User add(@RequestBody User admin);

	@GetMapping("/getById/{id}")
	public User getAdminById(@PathVariable int id);

	@PutMapping("/update")
	public User update(@RequestBody User admin);
	
	

}
