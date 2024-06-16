import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class chucnang extends Sinhvien {
    public ArrayList<Sinhvien> DS_SV;

    public chucnang() {
        super();
        DS_SV = new ArrayList<>();

    }
    public chucnang(int ID, String name, double DiemTB) {
        super(ID, name, DiemTB);
    }

    public void themSV() {
        System.out.println("nhập thông tin svien--------------- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập ID: ");
        int ID = sc.nextInt();
        sc.nextLine();
        System.out.print("nhập tên: ");
        String name = sc.nextLine();
        System.out.print("nhập điểm trung bình: ");
        double DIEMTB = sc.nextDouble();
        Sinhvien svienn = new Sinhvien(ID,name,DIEMTB);
        DS_SV.add(svienn);
        System.out.println("thêm sinh viên thành công");
    }
    public void xemDS_SV() {
        int dem = 1;
        System.out.print("Danh sách sinh viên: ");
        if(DS_SV.isEmpty()) {
            System.out.println("không tồn tại");
        } else {
            System.out.println(" ");
            for (Sinhvien svien : DS_SV) {
                System.out.println(dem + " ---- " + svien.toString());
                dem++;
            }
        }
        }
    public void sapXepDSTheoDiemTB() {
        if (DS_SV.isEmpty()) {
            System.out.println("không có sinh viên");
        } else {
            Collections.sort(DS_SV, (sv1, sv2) -> Double.compare(sv1.getDiemTB(), sv2.getDiemTB()));

            System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm TB:");
            int dem = 1;
            for (Sinhvien svien : DS_SV) {
                System.out.println(dem + " ---- " + svien.toString());
                dem++;
            }
        }
    }
    public void timkiem() {
        String Svien_tim;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên svien cần tìm: " );
        Svien_tim = sc.nextLine();
        for (Sinhvien svien : DS_SV) {
            if(Svien_tim.equals(svien.getName())) {
                System.out.println("sinh viên bạn cần tìm là: ");
                System.out.println(svien.toString());
            }
            else System.out.println("không tồn tại sinh viên này");
        }
    }
}
