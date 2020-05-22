package com.dts.studentManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dts.studentManager.dao.SinhVienDAO;
import com.dts.studentManager.entity.SinhVienEntity;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    @Autowired
    private SinhVienDAO sinhVienDAO;

    @Override
    @Transactional
    public List < SinhVienEntity > getSinhViens() {
        return sinhVienDAO.getSinhViens();
    }

    @Override
    @Transactional
    public void saveSinhVien(SinhVienEntity SinhVien) {
    	sinhVienDAO.saveSinhVien(SinhVien);
    }

    @Override
    @Transactional
    public SinhVienEntity getSinhVien (int theId) {
        return sinhVienDAO.getSinhVien(theId);
    }

    @Override
    @Transactional
    public void deleteSinhVien(int theId) {
        sinhVienDAO.deleteSinhVien(theId);
    }
}
