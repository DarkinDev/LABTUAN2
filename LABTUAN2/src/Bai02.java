class HinhChuNhat {

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }
    
    public double getChieuRong() {
        return chieuRong;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật: " +
               "\nChiều dài: " + chieuDai +
               "\nChiều rộng: " + chieuRong +
               "\nDiện tích: " + tinhDienTich() +
               "\nChu vi: " + tinhChuVi();
    }
}

public class Bai02 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double rong = scanner.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat();

        hcn.setChieuDai(dai);
        hcn.setChieuRong(rong);
        
        System.out.println("\nThông tin hình chữ nhật:");
        System.out.println(hcn.toString());
        
        scanner.close();
    }
}
