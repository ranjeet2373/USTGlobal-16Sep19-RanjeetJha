package com.ustglobal.librarywithbootdatajpa.service;

import com.ustglobal.librarywithbootdatajpa.dto.AdminBean;

public interface AdminService {
	public boolean registreLibrarian(AdminBean bean);
	public AdminBean loginLibrarian(AdminBean bean);
	public boolean updateLibrarian(AdminBean bean);
	public boolean deleteLibrarian(int id);
	public AdminBean searchAdmin(int id);

}
