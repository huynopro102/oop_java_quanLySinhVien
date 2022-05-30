package oop_quanLySinhVien;

public class main {
	public static void main(String[] args) {
	// luu y phai tao 1 object tu cai thap nhat
		Ngay ngay1 = new Ngay(3, 2, 2000);
		Ngay ngay2 = new Ngay(5, 12, 2010);
		Ngay ngay3 = new Ngay(5, 12, 2010);
		//
		Lop lop1 = new Lop("12a1", "khoa cong nghe thong tin");
		Lop lop2 = new Lop("12a1", "khoa cong nghe phan mem");
		Lop lop3 = new Lop("12a1", "khoa an toan thong tin");
		//
		SinhVien sv1 = new SinhVien("1234", "nguyen van a ", ngay1, 4, lop1);
		SinhVien sv2 = new SinhVien("12345", "nguyen van b ", ngay2, 7, lop2);
		SinhVien sv3 = new SinhVien("12346", "nguyen van c ", ngay3, 5, lop3);
		//
		System.out.println("ten khoa");
		System.out.println("sv 1 "+lop1.getTenKhoa());
		System.out.println("sv 2 "+lop2.getTenKhoa());
		System.out.println("sv 3 "+lop3.getTenKhoa());
		//
		System.out.println("sv 1 dau hay khong : "+sv1.KiemTraThiDauKhong());
		System.out.println("sv 2 dau hay khong : "+sv2.KiemTraThiDauKhong());
		System.out.println("sv 3 dau hay khong : "+sv3.KiemTraThiDauKhong());
		// kiem tra ngay sinh trung khong
		System.out.println("sv1 voi sv2 kiem tra trung khong :"+sv1.KiemTraTrungNgaySinh(sv2));
		System.out.println("sv2 voi sv3 kiem tra trung khong :"+sv2.KiemTraTrungNgaySinh(sv3));
		System.out.println("sv3 voi sv1 kiem tra trung khong :"+sv3.KiemTraTrungNgaySinh(sv1));
		
	}
}
