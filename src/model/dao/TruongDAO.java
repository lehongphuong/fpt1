package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.TotNghiep;
import model.bean.Truong;

public class TruongDAO {
	Connection con = null;

	public TruongDAO() {
		super();
		con = MyConnection.getConnect();
	}

	// select all

	public ArrayList<Truong> getListLop() {
		ArrayList<Truong> listLop = new ArrayList<>();
		String sql = "select * from Truong";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Truong l = new Truong();
				l.setMaTruong(rs.getString(1));
				l.setTenTruong(rs.getString(2));
				l.setDiaChi(rs.getString(3));
				l.setSoDt(rs.getString(4));

				listLop.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listLop;
	}

	// find cong viec by id
	public ArrayList<Truong> findTnById(String maTruong) {

		ArrayList<Truong> listLop = new ArrayList<>();
		String sql = "select * from Truong where maTn='" + maTruong + "' ";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Truong l = new Truong();
				l.setMaTruong(rs.getString(1));
				l.setTenTruong(rs.getString(2));
				l.setDiaChi(rs.getString(3));
				l.setSoDt(rs.getString(4));
				listLop.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listLop;
	}
}
