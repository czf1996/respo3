package com.hxzy.service;

import java.util.List;

import com.hxzyan.book.domain.Admin;
import com.hxzyan.dao.AdminDao;

public class AdminService {
	private AdminDao admindao = new AdminDao();
	public void addadmin(Admin admin) {
		admindao.insert(admin);
		
	}
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return admindao.findAll();
	}
	public Admin findAdminById(int id) {
		// TODO Auto-generated method stub
		return admindao.findById(id);
	}
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		admindao.update(admin);
		
	}
	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		admindao.delete(id);
	}
	public Admin findAdminByAP(String aaccount, String apassword) {
		// TODO Auto-generated method stub
		return admindao.findAdminByAccountAndPassword(aaccount, apassword);
	}
	

}
