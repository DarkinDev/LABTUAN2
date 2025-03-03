import java.util.Scanner;
class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thuePhaiNop;

    public Vehicle() {
        this.tenChuXe = "";
        this.loaiXe = "";
        this.dungTich = 0;
        this.triGia = 0.0;
        this.thuePhaiNop = 0.0;
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        tinhThuePhaiNop();
    }

    public String getTenChuXe() {
        return tenChuXe;
    }
    
    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }
    
    public String getLoaiXe() {
        return loaiXe;
    }
    
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    
    public int getDungTich() {
        return dungTich;
    }
    
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
        tinhThuePhaiNop();
    }
    
    public double getTriGia() {
        return triGia;
    }
    
    public void setTriGia(double triGia) {
        this.triGia = triGia;
        tinhThuePhaiNop();
    }
    
    public double getThuePhaiNop() {
        return thuePhaiNop;
    }

    private void tinhThuePhaiNop() {
        if (dungTich < 100) {
            thuePhaiNop = triGia * 0.01;
        } else if (dungTich <= 200) {
            thuePhaiNop = triGia * 0.03;
        } else {
            thuePhaiNop = triGia * 0.05;
        }
    }

    public String toString() {
        return String.format("%-20s%-20s%-10d%-20.2f%-20.2f", 
            tenChuXe, loaiXe, dungTich, triGia, thuePhaiNop);
    }
}

public class Bai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] danhSachXe = new Vehicle[3];
        
        while (true) {
            System.out.println("\n=== MENU QUẢN LÝ XE ===");
            System.out.println("1. Nhập thông tin và tạo các đối tượng xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng (1-3): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {   
                case 1:
                    for (int i = 0; i < 3; i++) {
                        scanner.nextLine();
                        System.out.println("\nNhập thông tin cho xe " + (i + 1) + ":");
                        System.out.print("Tên chủ xe: ");
                        String tenChuXe = scanner.nextLine();
                        System.out.print("Loại xe: ");
                        String loaiXe = scanner.nextLine();
                        System.out.print("Dung tích (cc): ");
                        int dungTich = scanner.nextInt();
                        System.out.print("Trị giá (triệu): ");
                        double triGia = scanner.nextDouble();
                        
                        danhSachXe[i] = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);
                    }
                    break;
                    
                case 2:
                    System.out.println("\nTên chủ xe\tLoại xe\t\tDung tích\tTrị giá\t\tThuế phải nộp");
                    for (Vehicle xe : danhSachXe) {
                        if (xe != null) {
                            System.out.println(xe);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Thoát chương trình!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }
}
