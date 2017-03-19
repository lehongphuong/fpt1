package model.bo;

import java.util.ArrayList;

import model.bean.Truong;
import model.dao.TruongDAO;

public class TruongBO {
	TruongDAO dao = new TruongDAO();

	// select all

	public ArrayList<Truong> getListLop() {
		return dao.getListLop();
	}

	// find cong viec by id
	public ArrayList<Truong> findTnById(String maTruong) {

		return dao.findTnById(maTruong);
	}

}
