package com.ustglobal.librarywithbootdatajpa.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ustglobal.librarywithbootdatajpa.dto.AdminBean;

@Transactional
public interface AdminRepositery extends JpaRepository<AdminBean, Integer> {
	
	@Query("from AdminBean where id=:id and password=:password")
	AdminBean login(@Param("id") int id , @Param("password") String password);
	
	
	
	@Modifying
	@Query("update AdminBean set name=:name , gender=:gender,password=:password where id=:id")
	void update(@Param("name") String name, @Param("gender") String gender ,@Param("password") String password, @Param("id") int id);

}
