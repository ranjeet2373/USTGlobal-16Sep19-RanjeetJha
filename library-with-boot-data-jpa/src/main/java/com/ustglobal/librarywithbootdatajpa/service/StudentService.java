package com.ustglobal.librarywithbootdatajpa.service;

import com.ustglobal.librarywithbootdatajpa.dto.StudentBean;

public interface StudentService {

	public StudentBean searchStudent(int rollno);
	public StudentBean loginStudent(StudentBean bean);
	public boolean registerStudent(StudentBean bean);
	public boolean deleteStudent(int rollno);
	public boolean updateStudent(StudentBean bean);
}
