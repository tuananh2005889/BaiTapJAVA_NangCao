import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee ng1 = new Employee("tuấn anh",18, "Đà Nẵng", 10, 9.0);
//        System.out.println(ng1);
        Employee ng2 = new Employee("tuấn",18, "Đà Nẵng", 10, 9.0);
        Employee ng3 = new Employee("anh",18, "Đà Nẵng", 10, 9.0);
        Employee ng4 = new Employee("nvtank",18, "Đà Nẵng", 10, 9.0);
        Employee em = new Employee();

        ArrayList<Employee> DSNV = new ArrayList<>();
        DSNV.add(ng1);
        DSNV.add(ng2);
        DSNV.add(ng3);
        DSNV.add(ng4);
        double tong = em.tongluong(DSNV);
        System.out.println(tong);
    }
}