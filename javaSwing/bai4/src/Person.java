import java.util.ArrayList;

public class Person {
    public String Name;
    public int Age;
    public String Adress;
    public ArrayList<Employee> DS;
    public Person(String name,int Age, String Adress) {
        this.Name = name;
        this.Age = Age;
        this.Adress = Adress;
    }

    public Person() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Adress='" + Adress + '\'' +
                '}';
    }
}
