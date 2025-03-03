import java.util.Scanner;
class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {
        this.stID = "";
        this.stName = "";
        this.stClass = "";
    }

    public Student(String stID, String stName, String stClass) {
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }

    public Student(Student st) {
        this.stID = st.stID;
        this.stName = st.stName;
        this.stClass = st.stClass;
    }

    public String getStID() {
        return stID;
    }

    public String getStName() {
        return stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStID(String id) {
        this.stID = id;
    }

    public void setStName(String name) {
        this.stName = name;
    }

    public void setStClass(String className) {
        this.stClass = className;
    }

    @Override
    public String toString() {
        return "Student [stID=" + stID + ", stName=" + stName + ", stClass=" + stClass + "]";
    }
}

class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public Book(Book bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }
}

class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public SanPham() {
        this.tenSP = "";
        this.donGia = 0.0;
        this.giamGia = 0.0;
    }

    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSP = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        this.giamGia = scanner.nextDouble();
        scanner.close();
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
}
public class Bai05 {
    public static void main(String[] args) {
        System.out.println("=== Kiểm tra lớp Student ===");
        Student student1 = new Student("S001", "Nguyen Van A", "12A1");
        System.out.println("Student 1: " + student1.toString());

        Student student2 = new Student(student1);
        System.out.println("Student 2 (copy of Student 1): " + student2.toString());

        Student student3 = new Student();
        student3.setStID("S002");
        student3.setStName("Tran Thi B");
        student3.setStClass("11A2");
        System.out.println("Student 3: " + student3.toString());
        System.out.println();

        System.out.println("=== Kiểm tra lớp Book ===");
        Book book1 = new Book("B001", "Java Programming", "Valorant");
        System.out.println("Book 1 - Code: " + book1.getBoCode() + 
                          ", Title: " + book1.getBoTitle() + 
                          ", Author: " + book1.getBoAuthor());

        Book book2 = new Book(book1);
        System.out.println("Book 2 (copy of Book 1) - Code: " + book2.getBoCode() + 
                          ", Title: " + book2.getBoTitle() + 
                          ", Author: " + book2.getBoAuthor());
        System.out.println();

        System.out.println("=== Kiểm tra lớp SanPham ===");
        SanPham sanPham1 = new SanPham("Laptop Dell", 15000000.0, 1000000.0);
        System.out.println("Thông tin Sản phẩm 1:");
        sanPham1.xuat();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Nhập thông tin sản phẩm");
            System.out.println("2. Hiển thị thông tin sản phẩm");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nNhập thông tin cho Sản phẩm:");
                    SanPham sanPham = new SanPham();
                    sanPham.nhap();
                    System.out.println("\nThông tin Sản phẩm:");
                    sanPham.xuat();
                    break;
                case 2:
                    System.out.println("Chức năng này chưa được triển khai.");
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
