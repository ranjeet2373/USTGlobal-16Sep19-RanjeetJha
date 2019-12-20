package com.ustglobal.librarywithbootdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarywithbootdatajpa.dto.AdminBean;
import com.ustglobal.librarywithbootdatajpa.dto.LibraryResponse;
import com.ustglobal.librarywithbootdatajpa.dto.StudentBean;
import com.ustglobal.librarywithbootdatajpa.service.AdminService;
import com.ustglobal.librarywithbootdatajpa.service.StudentService;

@RestController
public class LibraryController {
	
	@Autowired
	private LibraryResponse response;
	
	@Autowired
	private StudentService studeservice;
	
	@Autowired
	private AdminService adminservice;
	
	
	@PostMapping(path="/addstusent", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerStudent(@RequestBody StudentBean bean) {
		 if(studeservice.registerStudent(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data added in the db");
		 }else {
			 response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Data not added to the db");
		 }
		return response;
	}
	
	@GetMapping(path="/searchstudent", produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchStudent(@RequestParam("rollno") int rollno) {
		StudentBean studentBean = studeservice.searchStudent(rollno);
		if(studentBean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data present in the db");
			response.setStudentbean(studentBean);
		}else {
			 response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Data not present in the db");
		}
		return response;
	}
	
	@DeleteMapping(path="/deletestudent", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deletestudent(int rollno) {
		if(studeservice.deleteStudent(rollno)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data deleted in the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not deleted in the db");
		}
		return response;
	}
	
	@PutMapping(path="/updatestudent",consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE) 
	public LibraryResponse updatestudent(StudentBean bean) {
		if(studeservice!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data updated in the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not updated in the db");
		}
		return response;
	}
	
	@PostMapping(path="/loginstudent" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse loginStudent(@RequestBody StudentBean bean) {
		StudentBean studentBean = studeservice.loginStudent(bean);
		if(studentBean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("login successfully!!");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("faield to login");
		}
		return response;
	}
	
	
	@PostMapping(path="/addadmin" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerAdmin(@RequestBody AdminBean bean) {
		if(adminservice.registreLibrarian(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data added in the db");
		}else {
			 response.setStatusCode(401);
				response.setMessage("Failure");
				response.setDescription("Data not added to the db");
		}
		return response;
	}
	
	@GetMapping(path="/searchadmin",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchAdmin(@RequestParam("id")int id) {
		AdminBean adminBean = adminservice.searchAdmin(id);
		if(adminBean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data present in the db");
			response.setAdminbean(adminBean);
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not present in the db");
		}
		return response;
	}
	
	@DeleteMapping(path="/deleteadmin",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteAdmin(@RequestParam("id") int id) {
		if(adminservice.deleteLibrarian(id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data deleted in the db");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not deleted in the db");
		}
		return response;
	}
	
	@PostMapping(path="/loginadmin", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse loginAdmin(@RequestBody AdminBean bean) {
		AdminBean adminBean = adminservice.loginLibrarian(bean);
		if(adminBean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("login successfully!!");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("faield to login");
		}
		return response;
	}
	
	@PutMapping(path="/updateadmin" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateAdmin(@RequestBody AdminBean bean) {
		if(adminservice.updateLibrarian(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("data updated in the db");
			
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not updated in the db");
			
		}
		return response;
	}

}
   
