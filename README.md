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


CREATE TABLE CongViec (
maCongViec	nvarchar(255) NOT NULL PRIMARY KEY,
ngayVaoCongTy	nvarchar(255),
tenCongViec	nvarchar(255),
tenCongTy	nvarchar(255),
diaChiCongTy	nvarchar(255),
thoiGianLamViec	nvarchar(255)
 
);

 
CREATE TABLE Nganh (
maNganh	nvarchar(255) NOT NULL PRIMARY KEY,
tenNganh	nvarchar(255),
tenCongViec	nvarchar(255),
loaiNganh	nvarchar(255)
);
CREATE TABLE SinhVien (
 cmnd	nvarchar(255)  NOT NULL PRIMARY KEY,
 hoTen	nvarchar(255),
 email	nvarchar(255),
 sdt	nvarchar(255),
 diaChi	nvarchar(255),
 maTn	nvarchar(255),
 maCongViec	nvarchar(255),
 maTruong	nvarchar(255)

);

 
CREATE TABLE TotNghiep (
maTn	nvarchar(255) NOT NULL PRIMARY KEY,
heTn	nvarchar(255),
ngayTn	nvarchar(255),
loaiTn	nvarchar(255) 
);

 
CREATE TABLE Truong (
maTruong	nvarchar(255) NOT NULL PRIMARY KEY,
tenTruong	nvarchar(255),
diaChi	nvarchar(255),
tenCongTy	nvarchar(255),
soDt	nvarchar(255) 
 
);

 
