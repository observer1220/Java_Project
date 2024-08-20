import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        String file = JOptionPane.showInputDialog("請輸入文件名稱");
        File f = new File(file);
        int line_count = 0;
        int word_count = 0;
        int char_count = 0;
        
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                line_count++;
                String line = scanner.nextLine();
                String[] line_arr = line.split(" ");
                for (String word : line_arr) {
                    word_count++;
                }
                char_count += line.length();
            }
            scanner.close();

            System.out.println("Line count is " + line_count);
            System.out.println("Word count is " + word_count);
            System.out.println("Character count is " + char_count);
        } catch (
                FileNotFoundException e) {
            System.out.println(f + " not found.");
        }
    }
}
