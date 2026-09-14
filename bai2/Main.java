public class Main {

    public static void main(String[] args) {

        // 1. Tao hai san pham
        SanPham sp1 = new SanPham(
                "SP001",
                "Ban phim co",
                500000,
                10
        );

        SanPham sp2 = new SanPham(
                "SP002",
                "Chuot gaming",
                300000,
                20
        );

        // 2 Hien thi thong tin ban dau
        System.out.println("========== THONG TIN BAN DAU ==========");

        sp1.hienThiThongTin();

        System.out.println();

        sp2.hienThiThongTin();


        // 3 Nhap them hang cho san pham 1
        System.out.println("\n========== NHAP THEM HANG ==========");

        System.out.println("Truoc khi nhap hang:");
        sp1.hienThiThongTin();

        sp1.nhapHang(5);

        System.out.println("\nSau khi nhap 5 san pham:");
        sp1.hienThiThongTin();


        // 4 Thu ban hang thanh cong
        System.out.println("\n========== BAN HANG THANH CONG ==========");

        System.out.println("Truoc khi ban:");
        sp1.hienThiThongTin();

        boolean ketQua = sp1.banHang(3);

        System.out.println("\nKet qua ban hang: " + ketQua);

        System.out.println("\nSau khi ban 3 san pham:");
        sp1.hienThiThongTin();


        // 5 Thu ban qua so luong ton kho
        System.out.println("\n========== BAN QUA TON KHO ==========");

        System.out.println("Truoc khi ban:");
        sp1.hienThiThongTin();

        ketQua = sp1.banHang(100);

        System.out.println("\nKet qua ban hang: " + ketQua);

        System.out.println("\nSau khi thu ban 100 san pham:");
        sp1.hienThiThongTin();
    }
}
u