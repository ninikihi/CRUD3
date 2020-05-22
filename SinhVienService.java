package com.dts.studentManager.service;

import java.util.List;

import com.dts.studentManager.entity.SinhVienEntity;

public interface SinhVienService {

	
	public List <SinhVienEntity> getSinhViens();
	
	public void saveSinhVien(SinhVienEntity SinhVien);
	
	public SinhVienEntity getSinhVien(int theId);
	
	public void deleteSinhVien(int theId);
	
	

}