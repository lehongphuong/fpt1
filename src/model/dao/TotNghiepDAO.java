package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.TotNghiep;

public class TotNghiepDAO {
	Connection con = null;

	public TotNghiepDAO() {
		super();
		con = MyConnection.getConnect();
	}
 
	// select all
		public ArrayList<TotNghiep> getListLop() {
			ArrayList<TotNghiep> listLop = new ArrayList<>();
			String sql = "select * from TotNghiep";
			try { 
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()) {
					TotNghiep l =new TotNghiep();
					l.setMaTn(rs.getString(1));
					l.setHeTn(rs.getString(2));
					l.setNgayTn(rs.getString(3));
					l.setLoaiTn(rs.getString(4));
					 
					listLop.add(l);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return listLop;
		}
 

	// find cong viec by id
	public ArrayList<TotNghiep> findTnById(String maTn) {

		ArrayList<TotNghiep> listLop = new ArrayList<>();
		String sql = "select * from TotNghiep where maTn='" + maTn + "' ";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				TotNghiep l =new TotNghiep();
				l.setMaTn(rs.getString(1));
				l.setHeTn(rs.getString(2));
				l.setNgayTn(rs.getString(3));
				l.setLoaiTn(rs.getString(4));
				listLop.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listLop;
	}
}
