package oop_quanLySinhVien;



public class SinhVien {
	private String maSoSinhVien;
	private String hoVaTen;
	private Ngay ngaySinh;
	private float diemTrungBinh;
	private Lop lop;
	// tao con structor
	public SinhVien(String massv , String hoten , Ngay ngay , float diemtb ,Lop lop) {
		this.maSoSinhVien = massv;
		this.hoVaTen = hoten;
		this.ngaySinh = ngay;
		this.diemTrungBinh = diemtb;
		this.lop = lop;
	}
	// ham set de thay doi gia tri cua object
	public void setMaSoSinhVien(String mssv) {
		this.maSoSinhVien = mssv;
	}
	public void setHoVaTen(String hoten) {
		this.hoVaTen = hoten;
	}
	public void setNgaySinh(Ngay ng) {
		this.ngaySinh = ng;
	}
	public void setdiemTrungBinh(Lop lop) {
		this.lop = lop;
	}
	// tao ham get de lay gia tri cua object
	public String getMaSoSinhVien() {
		return this.maSoSinhVien;
	}
	public String getHoVaTen() {
		return this.hoVaTen;
	}
	public String getHoVaTen() {
		return this.hoVaTen;
	}
	public Ngay getNgay() {
		return this.ngay;
	}
	public float getDiemTrungBinh() {
		return this.diemTrungBinh;
	}
	public Lop getLop() {
		return this.lop;
	}
	// ham lay ten khoa
	public String LyTenKhoa() {
		return this.lop.getTenKhoa();
	}
	// ham kiem tra thi dau hay khong
	public boolean KiemTraThiDauKhong() {
		if(this.diemTrungBinh<5) {
			return false;
		}
		else {
			return true;
		}
	}
	// so sanh ngay sinh trung khong
	public boolean KiemTraTrungNgaySinh(SinhVien svkhac) {
		return this.ngaySinh.equals(svkhac.ngaySinh);
	}
	
}
