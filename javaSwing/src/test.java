import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame{
    private JPanel Jpanel;
    private JTextField b;
    private JButton nhan;
    private JTextField a;
    private JTextField c;
    private JButton cong;
    private JButton chia;
    private JButton tru;

    public test() {
        cong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = a.getText();
                String num2 = b.getText();

                try {
                    int number1 = Integer.parseInt(num1);
                    int number2 = Integer.parseInt(num2);
                    int sum = number1 + number2;

                    c.setText(String.valueOf(sum));
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "lỗi");
                }
            }
        });
        nhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = a.getText();
                String num2 = b.getText();

                try {
                    int number1 = Integer.parseInt(num1);
                    int number2 = Integer.parseInt(num2);
                    int sum = number1 * number2;

                    c.setText(String.valueOf(sum));
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "lỗi");
                }
            }
        });
        tru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = a.getText();
                String num2 = b.getText();

                try {
                    int number1 = Integer.parseInt(num1);
                    int number2 = Integer.parseInt(num2);
                    int sum = number1 - number2;

                    c.setText(String.valueOf(sum));
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "lỗi");
                }
            }
        });
        chia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = a.getText();
                String num2 = b.getText();

                try {
                    int number1 = Integer.parseInt(num1);
                    int number2 = Integer.parseInt(num2);
                    int sum = number1 - number2;

                    c.setText(String.valueOf(sum));
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "lỗi");
                }
            }
        });
    }

    public static void main(String[] args) {
        test t = new test();
        t.setContentPane(t.Jpanel);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

