import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ProductConsumerApp extends JFrame {
    private JTextArea logTextArea;
    private JButton startButton, stopButton;
    private Thread productConsumerThread;

    public ProductConsumerApp() {
        setTitle("Product Consumer App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
    }

    private void initComponents() {
        logTextArea = new JTextArea();
        logTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(logTextArea);

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startProductConsumerThread();
            }
        });

        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopProductConsumerThread();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void startProductConsumerThread() {
        logTextArea.append("Product Consumer Thread started with random quantity.\n");

        // Sinh số ngẫu nhiên trong khoảng từ 1 đến 100
        Random random = new Random();
        int quantity = random.nextInt(100) + 1;

        // Tạo và bắt đầu một thread mới
        ProductConsumer productConsumer = new ProductConsumer(quantity);
        productConsumerThread = new Thread(productConsumer);
        productConsumerThread.start();
    }

    private void stopProductConsumerThread() {
        logTextArea.append("Stopping Product Consumer Thread.\n");

        // Dừng thread nếu đang chạy
        if (productConsumerThread != null && productConsumerThread.isAlive()) {
            productConsumerThread.interrupt();
        }
    }

    private class ProductConsumer implements Runnable {
        private int quantity;

        public ProductConsumer(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    // Xử lý công việc nền ở đây
                    // Ví dụ: Mô phỏng việc tiêu thụ sản phẩm với số lượng
                    logTextArea.append("Consuming " + quantity + " products...\n");
                    Thread.sleep(1000); // Giả lập thời gian tiêu thụ
                }
            } catch (InterruptedException e) {
                // Thread bị gián đoạn, có thể là do đang đóng ứng dụng
                logTextArea.append("Product Consumer Thread interrupted.\n");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProductConsumerApp().setVisible(true);
            }
        });
    }
}
