package model.bean;

public class Nganh {
	private String maNganh;
	private String tenNganh;
	private String loaiNganh;

	public Nganh() {
		super();
	}

	public Nganh(String maNganh, String tenNganh, String loaiNganh) {
		super();
		this.maNganh = maNganh;
		this.tenNganh = tenNganh;
		this.loaiNganh = loaiNganh;
	}

	public String getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(String maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public String getLoaiNganh() {
		return loaiNganh;
	}

	public void setLoaiNganh(String loaiNganh) {
		this.loaiNganh = loaiNganh;
	}

}
