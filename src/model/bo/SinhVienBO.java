package model.bo;

import java.util.ArrayList;

import model.bean.SinhVien;
import model.dao.SinhVienDAO;

public class SinhVienBO {

	SinhVienDAO dao = new SinhVienDAO();

	// select all
	public ArrayList<SinhVien> getListLop() {
		return dao.getListLop();
	}

	// insert
	public void insertSV(SinhVien sv) {
		dao.insertSV(sv);
	}

	// update
	public void updateSV(SinhVien sv) {
		dao.updateSV(sv);
	}

	// delete
	public void deleteSV(String cmnd) {
		dao.deleteSV(cmnd);
	}

	// find sv by name
	public ArrayList<SinhVien> findSvByName(String hoTen) {
		return dao.findSvByName(hoTen);
	}

}
