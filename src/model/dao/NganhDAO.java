package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.CongViec;
import model.bean.Nganh;

public class NganhDAO {
	Connection con = null;

	public NganhDAO() {
		super();
		con = MyConnection.getConnect();
	}

	// select all
		public ArrayList<Nganh> getListLop() {
			ArrayList<Nganh> listLop = new ArrayList<>();
			String sql = "select * from Nganh";
			try { 
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()) {
					Nganh l = new Nganh();
					l.setMaNganh(rs.getString(1));
					l.setTenNganh(rs.getString(2));
					l.setLoaiNganh(rs.getString(3));
					 
					listLop.add(l);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return listLop;
		}
 

	// find cong viec by id
	public ArrayList<Nganh> findTnById(String maNganh) {

		ArrayList<Nganh> listLop = new ArrayList<>();
		String sql = "select * from nganh where maNganh='" + maNganh + "' ";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Nganh l = new Nganh();
				l.setMaNganh(rs.getString(1));
				l.setTenNganh(rs.getString(2));
				l.setLoaiNganh(rs.getString(3));
				listLop.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listLop;
	}
}
