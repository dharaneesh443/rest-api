package com.skcet.JPQL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.JPQL.model.JPQLModel;
import com.skcet.JPQL.service.JQPLService;

@RestController
public class JQPLController {
	@Autowired
	public JQPLService hserv;
	@GetMapping("/getall")
	public List<JPQLModel> getall()
	{
		return hserv.getall();
	}
	@GetMapping("/specific/{add}/{name}")
	public List<JPQLModel> getSpec(@PathVariable("add") String add,@PathVariable("name") String name)
	{
		return hserv.getSpecrows(add, name);
	}
	@DeleteMapping("/deleterow/{id}")
	public String deleteRow(@PathVariable("id") int id) {
		return hserv.deleteRowByid(id)+"deleted";
	}
	

}
