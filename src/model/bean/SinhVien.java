package model.bean;

public class SinhVien {
	private String cmnd;
	private String hoTen;
	private String email;
	private String sdt;
	private String diaChi;
	private String maTn;
	private String maCongViec;
	private String maTruong;

	public SinhVien() {
		super();
	}

	SinhVien(String cmnd, String hoTen, String email, String sdt,
			String diaChi, String maTn, String maCongViec, String maTruong) {
		super();
		this.cmnd = cmnd;
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.maTn = maTn;
		this.maCongViec = maCongViec;
		this.maTruong = maTruong;
	}

	public String getMaTruong() {
		return maTruong;
	}

	public void setMaTruong(String maTruong) {
		this.maTruong = maTruong;
	}

	public String getMaTn() {
		return maTn;
	}

	public void setMaTn(String maTn) {
		this.maTn = maTn;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(String maCongViec) {
		this.maCongViec = maCongViec;
	}

}
