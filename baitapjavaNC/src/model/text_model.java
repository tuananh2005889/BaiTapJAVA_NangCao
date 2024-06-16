package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class text_model {
    private List<String> lines;

    public text_model() {
        lines = new ArrayList<>();
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public void saveToFile(File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    public void loadFromFile(File file) throws IOException {
        List<String> newLines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                newLines.add(line); // Thêm dòng vào danh sách mới
            }
        }
        lines = newLines; // Gán danh sách mới cho lines
    }

}
