package view;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import contro.text_contro;
import model.text_model;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;

public class text_view extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private JButton openButton;
    private JButton saveButton;
    private JFileChooser fileChooser;
    private text_model model;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                text_model model = new text_model();
                text_view view = new text_view(model);
                text_contro controller = new text_contro(model, view);
                view.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public text_view(text_model model) {
        this.model = model;

        setTitle("Text Editor");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.CENTER);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        openButton = new JButton("Open");
        buttonPanel.add(openButton);

        saveButton = new JButton("Save");
        buttonPanel.add(saveButton);

        JTextArea finalTextArea = textArea;
        addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                model.setLines(Arrays.asList(textArea.getText().split("\n")));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                model.setLines(Arrays.asList(textArea.getText().split("\n")));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                model.setLines(Arrays.asList(textArea.getText().split("\n")));
            }
        });

    }

    public String getText() {
        return textArea.getText();
    }

    public void setText(String text) {
        textArea.setText(text);
    }

    public File showOpenDialog() {
        if (fileChooser == null) {
            fileChooser = new JFileChooser();
        }
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }

    public File showSaveDialog() {
        if (fileChooser == null) {
            fileChooser = new JFileChooser();
        }
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }

    public void addOpenButtonListener(ActionListener listener) {
        openButton.addActionListener(listener);
    }

    public void addSaveButtonListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }

    public void addDocumentListener(DocumentListener listener) {
        textArea.getDocument().addDocumentListener(listener);
    }
}
