package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.CongViec;
import model.bean.SinhVien;

public class CongViecDAO {
	
	Connection con = null;

	public CongViecDAO() {
		super();
		con = MyConnection.getConnect();
	}

	// select all
		public ArrayList<CongViec> getListLop() {
			ArrayList<CongViec> listLop = new ArrayList<>();
			String sql = "select * from CongViec";
			try { 
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()) {
					CongViec l = new CongViec();
					l.setMaCongViec(rs.getString(1));
					l.setNgayVaoCongTy(rs.getString(2));
					l.setTenCongViec(rs.getString(3));
					l.setTenCongTy(rs.getString(4));
					l.setDiaChiCongTy(rs.getString(5));
					l.setThoiGianLamViec(rs.getString(6));
					listLop.add(l);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return listLop;
		}
 

	// find cong viec by id
	public ArrayList<CongViec> findTnById(String maCongViec) {

		ArrayList<CongViec> listLop = new ArrayList<>();
		String sql = "select * from CongViec where maCongViec='" + maCongViec + "' ";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				CongViec l = new CongViec();
				l.setMaCongViec(rs.getString(1));
				l.setNgayVaoCongTy(rs.getString(2));
				l.setTenCongViec(rs.getString(3));
				l.setTenCongTy(rs.getString(4));
				l.setDiaChiCongTy(rs.getString(5));
				l.setThoiGianLamViec(rs.getString(6));
				listLop.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listLop;
	}

}
