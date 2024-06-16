package contro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import model.text_model;
import view.text_view;

public class text_contro {
    private text_model model;
    private text_view view;

    public text_contro(text_model model, text_view view) {
        this.model = model;
        this.view = view;

        view.addOpenButtonListener(e -> {
            File file = view.showOpenDialog();
            if (file != null) {
                try {
                    // Mở file bằng trình duyệt Cốc Cốc
                    openFileInBrowser(file);
                    // Load nội dung của file vào textArea
                    model.loadFromFile(file);
                    view.setText(String.join("\n", model.getLines()));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        view.addSaveButtonListener(e -> {
            File file = view.showSaveDialog();
            if (file != null) {
                try {
                    model.saveToFile(file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Phương thức để mở file bằng trình duyệt web
    private void openFileInBrowser(File file) {
        try {
            // Sử dụng ProcessBuilder để mở file bằng trình duyệt mặc định
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "start", "C:\\Program Files (x86)\\CocCoc\\Browser\\browser.exe", file.getAbsolutePath());
            pb.start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        text_model model = new text_model();
        text_view view = new text_view(model);
        text_contro controller = new text_contro(model, view);
        view.setVisible(true);
    }
}
