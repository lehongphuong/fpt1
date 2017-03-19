# fpt1
congviec(private String ngayVaoCongTy;
	private String tenCongViec;
	private String tenTongTy;
	private String diaChiCongTy;
	private String thoiGianLamViec;
	private ClassSinhVien classSinhVien;)
nganh(private Integer maNganh;
	private String tenNganh;
	private String loaiNganh;
	private Set<ClassTotNghiep> classTotNghiep;)
sinhVien(private Integer soCmnd;
	private String hoTen;
	private String email;
	private String soDt;
	private String diaChi;
	private Set<ClassTotNghiep> classTotNghiep;
	private Set<ClassCongViec> classCongViec;)
TotNghiep(private Integer id;
	private String heTn;
	private String ngayTn;
	private String loaiTn;
	private  ClassSinhVien classSinhVien;
	private ClassTruong classTruong;
	private ClassNganh classNganh;)
Truong(private Integer maTruong;
	private String tenTruong;
	private String diaChi;
	private String soDt;
	private Set<ClassTotNghiep> classTotNghiep;)
	
	them sinh vien (So CMND,Ho ten,Email,So dien thoai,Dia chi)
	
	them tot nghiep(chon sinh vien, ten truong, ten nganh, he tot nghiep, ngay tot nghiep, loai tot nghiep)
	tim kiem co ban tim kiem theo ten,
	<th>So CMND</th>
	<th>Ho ten</th>
	<th>Email</th>
	<th>So dien thoai</th>
	<th>Dia chi</th>
	
	tim kiem nang cao them nhieu ten truong hon
	<th>So CMND</th>
	<th>Ho ten</th>
	<th>Ma nganh tot nghiep</th>
	<th>Ma truong</th>
	<th>Ma nganh cong ty</th>
	<th>Ten cong ty</th>
	<th>Thoi gian lam viec</th>
