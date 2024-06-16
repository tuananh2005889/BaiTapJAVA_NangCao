package ngay13thang3;

public class hailuong_chanle extends Thread{
    public void runchan() {
        for (int i = 2; i <=20; i+=2) {
            System.out.println("so chan: " +i + " ");
        }
    }
    public void runle() {
        for (int i = 1; i < 20 ; i+=2) {
            System.out.println("so le: " +i + " ");
        }
    }
    public void run() {
        runchan();
        runle();
    }

    public static void main(String[] args) {
        hailuong_chanle ex2 = new hailuong_chanle();
        ex2.start();
    }
}
