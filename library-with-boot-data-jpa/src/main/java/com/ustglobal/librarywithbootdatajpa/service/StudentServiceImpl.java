package com.ustglobal.librarywithbootdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarywithbootdatajpa.dto.StudentBean;
import com.ustglobal.librarywithbootdatajpa.repo.StudentRepositery;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepositery studrepo;
	@Override
	public StudentBean searchStudent(int rollno) {
		
		return studrepo.findById(rollno).get();
	}

	@Override
	public StudentBean loginStudent(StudentBean bean) {
		return studrepo.login(bean.getRollno(), bean.getPassword());
	}

	@Override
	public boolean registerStudent(StudentBean bean) {
		studrepo.save(bean);
		return true;
		
	}

	@Override
	public boolean deleteStudent(int rollno) {
		studrepo.deleteById(rollno);
		return true;
	}

	@Override
	public boolean updateStudent(StudentBean bean) {
		studrepo.update(bean.getRollno(), bean.getGender(), bean.getPassword(),bean.getDepartment(),bean.getName());
		return true;
	}

}
