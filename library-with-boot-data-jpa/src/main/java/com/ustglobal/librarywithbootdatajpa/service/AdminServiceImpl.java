package com.ustglobal.librarywithbootdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarywithbootdatajpa.dto.AdminBean;
import com.ustglobal.librarywithbootdatajpa.repo.AdminRepositery;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepositery adminrepo;
	@Override
	public boolean registreLibrarian(AdminBean bean) {
		adminrepo.save(bean);
		return true;
		
	}

	@Override
	public AdminBean loginLibrarian(AdminBean bean) {
		return adminrepo.login(bean.getId(),bean.getPassword());
	}

	@Override
	public boolean updateLibrarian(AdminBean bean) {
		adminrepo.update(bean.getName(),bean.getGender(),bean.getPassword(),bean.getId());
		return true;
	}

	@Override
	public boolean deleteLibrarian(int id) {
		adminrepo.deleteById(id);
		return true;
	}

	@Override
	public AdminBean searchAdmin(int id) {
		return adminrepo.findById(id).get();
	}

}
