package model.bean;

public class CongViec {
	private String maCongViec;
	private String ngayVaoCongTy;
	private String tenCongViec;
	private String tenCongTy;
	private String diaChiCongTy;
	private String thoiGianLamViec;

	public CongViec() {
		super();
	}

	public CongViec(String maCongViec, String ngayVaoCongTy,
			String tenCongViec, String tenCongTy, String diaChiCongTy,
			String thoiGianLamViec) {
		super();
		this.maCongViec = maCongViec;
		this.ngayVaoCongTy = ngayVaoCongTy;
		this.tenCongViec = tenCongViec;
		this.tenCongTy = tenCongTy;
		this.diaChiCongTy = diaChiCongTy;
		this.thoiGianLamViec = thoiGianLamViec;
	}

	public String getMaCongViec() {
		return maCongViec;
	}

	public void setMaCongViec(String maCongViec) {
		this.maCongViec = maCongViec;
	}

	public String getNgayVaoCongTy() {
		return ngayVaoCongTy;
	}

	public void setNgayVaoCongTy(String ngayVaoCongTy) {
		this.ngayVaoCongTy = ngayVaoCongTy;
	}

	public String getTenCongViec() {
		return tenCongViec;
	}

	public void setTenCongViec(String tenCongViec) {
		this.tenCongViec = tenCongViec;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public String getDiaChiCongTy() {
		return diaChiCongTy;
	}

	public void setDiaChiCongTy(String diaChiCongTy) {
		this.diaChiCongTy = diaChiCongTy;
	}

	public String getThoiGianLamViec() {
		return thoiGianLamViec;
	}

	public void setThoiGianLamViec(String thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}

}
