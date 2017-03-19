package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.SinhVien;

import common.ClearLanguage;

public class SinhVienDAO {

	Connection con = null;

	public SinhVienDAO() {
		super();
		con = MyConnection.getConnect();
	}

	// select all
	public ArrayList<SinhVien> getListLop() {
		ArrayList<SinhVien> listLop = new ArrayList<>();
		String sql = "select * from SinhVien";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				SinhVien l = new SinhVien();
				l.setCmnd(rs.getString(1));
				l.setHoTen(rs.getString(2));
				l.setEmail(rs.getString(3));
				l.setDiaChi(rs.getString(4));
				l.setMaTn(rs.getString(5));
				l.setMaCongViec(rs.getString(6));
				l.setMaTruong(rs.getString(7));
				listLop.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listLop;
	}

	// insert
	public void insertSV(SinhVien sv) {
		String sql = "insert into sinhvien values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setString(1, sv.getCmnd());
			pr.setString(2, sv.getHoTen());
			pr.setString(3, sv.getEmail());
			pr.setString(4, sv.getSdt());
			pr.setString(5, sv.getDiaChi());
			pr.setString(6, sv.getMaTn());
			pr.setString(7, sv.getMaCongViec());
			pr.setString(8, sv.getMaTruong());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// update
	public void updateSV(SinhVien sv) {
		String sql = "update sinhvien set hoTen=?,email=?,sdt=?,diaChi=?,maTn=?,maCongViec=?,maTruong=?, where cmnd=?";
		try {
			PreparedStatement pr = con.prepareStatement(sql);

			pr.setString(8, sv.getCmnd());
			pr.setString(1, sv.getHoTen());
			pr.setString(2, sv.getEmail());
			pr.setString(3, sv.getSdt());
			pr.setString(4, sv.getDiaChi());
			pr.setString(5, sv.getMaTn());
			pr.setString(6, sv.getMaCongViec());
			pr.setString(7, sv.getMaTruong());

			pr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// delete
	public void deleteSV(String cmnd) {
		String sql = "delete from sinhvien where cmnd='" + cmnd + "'";
		try {
			Statement st = con.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// find sv by name
	public ArrayList<SinhVien> findSvByName(String hoTen) {

		ArrayList<SinhVien> listSv = new ArrayList<>();
		String sql = "select * from SinhVien where hoTen='" + hoTen + "' ";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				SinhVien l = new SinhVien();
				l.setCmnd(rs.getString(1));
				l.setHoTen(rs.getString(2));
				l.setEmail(rs.getString(3));
				l.setDiaChi(rs.getString(4));
				l.setMaTn(rs.getString(5));
				l.setMaCongViec(rs.getString(6));
				l.setMaTruong(rs.getString(7));
				listSv.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listSv;
	}


}
