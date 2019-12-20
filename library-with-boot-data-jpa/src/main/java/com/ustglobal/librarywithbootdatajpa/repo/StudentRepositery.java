package com.ustglobal.librarywithbootdatajpa.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ustglobal.librarywithbootdatajpa.dto.StudentBean;

public interface StudentRepositery  extends JpaRepository<StudentBean, Integer>{
	@Transactional
	@Modifying
	@Query("update StudentBean set name=:name , gender=:gender , password=:password,department=:department where rollno=:rollno")
	void update(@Param("rollno") int rollno , @Param("gender") String gender, @Param("password") String password, @Param("department") String department, @Param("name") String name);
	
	@Query("from StudentBean where rollno=:rollno and password=:password")
	StudentBean login(@Param("rollno") int rollno ,@Param("password") String password);
}
