package ngay13thang3;

public class thread_helloworld extends Thread{
    public void run() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        thread_helloworld ex1 = new thread_helloworld();
        ex1.start();
    }
}
