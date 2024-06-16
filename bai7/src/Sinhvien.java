public class Sinhvien {
    public int ID;
    public String name;
    public double DiemTB;

    public Sinhvien(int ID,String name,double DiemTB) {
        this.ID = ID;
        this.name = name;
        this.DiemTB = DiemTB;
    }

    public Sinhvien() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double diemTB) {
        DiemTB = diemTB;
    }

    @Override
    public String toString() {
        return
                "ID: " + ID +
                ", Tên: " + name +
                ", Điểm TB: " + DiemTB +
                '}';
    }
}
