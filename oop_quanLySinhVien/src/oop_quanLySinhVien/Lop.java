package oop_quanLySinhVien;

public class Lop {
	private String tenLop;
	private String tenKhoa;
	// tao constructor
	public Lop(String tenlop , String tenkhoa) {
		this.tenLop = tenlop;
		this.tenKhoa = tenkhoa;
	}
	// tao ham set the thay doi gia tri cua object
	public void setTenLop(String tenlop) {
		this.tenLop = tenlop;
	}
	public void setTenKhoa(String tenkhoa) {
		this.tenKhoa = tenkhoa;
	}
	// tao ham get de lay gia tri cua ham
	public String getTenLop() {
		return this.tenLop;
	}
	public String getTenKhoa() {
		return this.tenKhoa;
	}
}
