package com.skcet.JPQL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.JPQL.model.JPQLModel;
import com.skcet.JPQL.repository.JPQLRepository;

@Service
public class JQPLService {
	@Autowired
	public JPQLRepository hrepo;
	public List<JPQLModel> getall()
	{
		return hrepo.getall();
	}
	public List<JPQLModel> getSpecrows(String add,String name)
	{
		return hrepo.getSpecRows(add,name);
	}
	public int deleteRowByid(int id) {
		return hrepo.deleteId(id);
	}

}
