import java.util.Scanner;
class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen = "";
        this.diemLT = 0.0f;
        this.diemTH = 0.0f;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }
    
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public float getDiemLT() {
        return diemLT;
    }
    
    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }
    
    public float getDiemTH() {
        return diemTH;
    }
    
    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiemTB() {
        return (diemLT + diemTH) / 2;
    }

    public String toString() {
        return String.format("%-10d%-20s%-10.2f%-10.2f%-10.2f", 
            maSV, hoTen, diemLT, diemTH, tinhDiemTB());
    }
}
public class Bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        SinhVien sv1 = new SinhVien(111111, "Nguyễn Gia Huy", 6.50f, 8.50f);
        
        SinhVien sv2 = new SinhVien(222222, "Lê Văn Luyện", 7.50f, 8.00f);
        
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhập mã số của sinh viên sv3:");
        int maSV = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập họ và tên của sinh viên sv3:");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập điểm lý thuyết của sinh viên sv3:");
        float diemLT = scanner.nextFloat();
        System.out.println("Nhập điểm thực hành của sinh viên sv3:");
        float diemTH = scanner.nextFloat();

        sv3.setMaSV(maSV);
        sv3.setHoTen(hoTen);
        sv3.setDiemLT(diemLT);
        sv3.setDiemTH(diemTH);

        System.out.println("masv\thoten\tdiemlt\tdiemth\tdiemtb");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        
        scanner.close();
    }
}
