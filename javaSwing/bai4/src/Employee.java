import java.util.ArrayList;

public class Employee extends Person {
    public double Salary;
    public double Rate;

    public Employee() {
        super();

    }
    public Employee(String name, int Age, String Adress, double Salary, double Rate) {
        super(name, Age, Adress);
        this.Salary = Salary;
        this.Rate =Rate;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Salary=" + Salary +
                ", Rate=" + Rate +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Adress='" + Adress + '\'' +
                '}';
    }
    public double tongluong(ArrayList<Employee> DS) {
        double tong = 0;
        for (Employee ng : DS) {
            tong += ng.getSalary();
        }
        return tong;
    }
}
