package model.bo;

import java.util.ArrayList;

import model.bean.Nganh;
import model.dao.NganhDAO;

public class NganhBO {
	NganhDAO dao = new NganhDAO();

	// select all
	public ArrayList<Nganh> getListLop() {
		return dao.getListLop();
	}

	// find cong viec by id
	public ArrayList<Nganh> findTnById(String maNganh) {

		return dao.findTnById(maNganh);
	}

}
