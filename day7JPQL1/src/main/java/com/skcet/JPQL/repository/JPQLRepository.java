package com.skcet.JPQL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skcet.JPQL.model.JPQLModel;

import jakarta.transaction.Transactional;

public interface JPQLRepository extends JpaRepository<JPQLModel,Integer> {
	@Query(value = "select * from resort",nativeQuery = true)
	public List<JPQLModel>getall();
	@Query(value = "select * from resort where address=:addr and hotelname=:name",nativeQuery = true)
	public List<JPQLModel>
	getSpecRows(@Param("addr") String addr,@Param("name")String name);
	@Modifying
	@Transactional
	@Query(value = "Delete from resort where hotelid:?1",nativeQuery = true)
	public int deleteId(@Param("id")int id);

}
