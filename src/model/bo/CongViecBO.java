package model.bo;

import java.util.ArrayList;

import model.bean.CongViec;
import model.dao.CongViecDAO;

public class CongViecBO {
	CongViecDAO dao = new CongViecDAO();

	// select all
	public ArrayList<CongViec> getListLop() {
		return dao.getListLop();
	}

	// find cong viec by id
	public ArrayList<CongViec> findTnById(String maCongViec) {
		return dao.findTnById(maCongViec);
	}

}
