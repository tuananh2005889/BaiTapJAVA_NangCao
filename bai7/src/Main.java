import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            chucnang cn = new chucnang();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Nhập lựa chọn của bạn: ");
            int luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    cn.themSV();
                    break;
                case 2:
                    cn.xemDS_SV();
                    break;
                case 3:
                    cn.sapXepDSTheoDiemTB();
                    break;
                case 4:
                    cn.timkiem();
                    break;
                default:
            }
        }

    }
}