package oop_quanLySinhVien;

import java.util.Objects;

public class Ngay {
	private int ngay;
	private int thang;
	private int nam;
	// tao 1 constructor
	public Ngay(int ngay,int thang ,int nam) {
		this.nam = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	// tao ham set de thay doi gia tri cua object
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	// tao ham get de lay gia tri cua object
	public int getNgay() {
		return this.ngay;
	}
	public int getThang() {
		return this.thang;
	}
	public int getNam() {
		return this.nam;
	}
	// so sanh
	@Override
	public int hashCode() {
		return Objects.hash(nam, ngay, thang);
	}
	@Override
	public boolean equals(Object obj) {
		// khi nhận vào hàm equals sẽ nhận vào 1 obj , nó sẽ là 1 dữ liệu bất kì
		if (this == obj) // this ở đây đc hiểu là tất cả các đối tượng trong class này
			//obj == null boi vi co 1 so đối tượng rỗng
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ngay other = (Ngay) obj; // nó sẽ ép kiểu đối tượng truyền vào
		return nam == other.nam && ngay == other.ngay && thang == other.thang;
	}
	
}
