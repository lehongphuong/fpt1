package model.bean;

public class TotNghiep {
	private String maTn;
	private String heTn;
	private String ngayTn;
	private String loaiTn;

	public TotNghiep() {
		super();
	}

	public TotNghiep(String maTn, String heTn, String ngayTn, String loaiTn) {
		super();
		this.maTn = maTn;
		this.heTn = heTn;
		this.ngayTn = ngayTn;
		this.loaiTn = loaiTn;
	}

	public String getMaTn() {
		return maTn;
	}

	public void setMaTn(String maTn) {
		this.maTn = maTn;
	}

	public String getHeTn() {
		return heTn;
	}

	public void setHeTn(String heTn) {
		this.heTn = heTn;
	}

	public String getNgayTn() {
		return ngayTn;
	}

	public void setNgayTn(String ngayTn) {
		this.ngayTn = ngayTn;
	}

	public String getLoaiTn() {
		return loaiTn;
	}

	public void setLoaiTn(String loaiTn) {
		this.loaiTn = loaiTn;
	}

}
