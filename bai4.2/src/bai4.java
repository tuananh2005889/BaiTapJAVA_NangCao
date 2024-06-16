import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai4 {
    private JTextField ketqua;
    private JTextField text1;
    private JTextField text2;
    private JButton tru;
    private JButton nhan;
    private JButton cong;
    private JButton chia;
    private JPanel j;

    public bai4() {
        cong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Xử lý sự kiện khi nút "Cộng" được nhấn
                // Thêm mã xử lý ở đây
            }
        });

        // Khởi tạo JPanel
        j = new JPanel();
        j.add(text1);
        j.add(text2);
        j.add(cong);
        j.add(tru);
        j.add(nhan);
        j.add(chia);
        j.add(ketqua);
    }

    private void createAndShowGUI() {
        // Tạo JFrame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Đặt nội dung của JFrame là JPanel
        frame.setContentPane(j);

        // Cấu hình kích thước cửa sổ
        frame.setSize(400, 200);

        // Hiển thị cửa sổ
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            bai4 calculator = new bai4();
            calculator.createAndShowGUI();
        });
    }
}
