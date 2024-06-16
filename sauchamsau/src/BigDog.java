public class BigDog extends Dog {
    BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Gâuuu");
    }
    @Override
    public void greets(Dog another) {
        System.out.println("Gâuuuuuuuuuuuuuuu");
    }
    public void greets(BigDog another) {
        System.out.println("Gâuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }
}
