package model.bo;

import java.util.ArrayList;

import model.bean.TotNghiep;
import model.dao.TotNghiepDAO;

public class TotNghiepBO {

	TotNghiepDAO dao = new TotNghiepDAO();

	// select all
	public ArrayList<TotNghiep> getListLop() {
		return dao.getListLop();
	}

	// find cong viec by id
	public ArrayList<TotNghiep> findTnById(String maTn) {

		return dao.findTnById(maTn);
	}

}
