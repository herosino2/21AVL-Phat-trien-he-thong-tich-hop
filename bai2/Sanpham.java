public class SanPham {

    private String maSanPham;
    private String tenSanPham;
    private double donGia;
    private int soLuong;

    // 2 Constructor đầy đủ tham số
    public SanPham(String maSanPham, String tenSanPham, double donGia, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    // 3 Getter
    public String getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    // 4 Tính thành tiền
    public double tinhThanhTien() {
        return donGia * soLuong;
    }

    // 5 Nhập hàng
    public void nhapHang(int soLuongNhap) {
        if (soLuongNhap > 0) {
            soLuong += soLuongNhap;
        }
    }

    // 6 Bán hàng
    public boolean banHang(int soLuongBan) {
        if (soLuongBan > 0 && soLuongBan <= soLuong) {
            soLuong -= soLuongBan;
            return true;
        }

        return false;
    }

    // 7 Hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong ton kho: " + soLuong);
        System.out.println("Thanh tien: " + tinhThanhTien());
    }
}

