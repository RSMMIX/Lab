import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Display_random {
    public static void main(String[] args) {
        Random random = new Random();
        JFrame f = new JFrame("Random Matrix");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 10));
        for(int i = 0; i < 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                panel.add(new TextField(random.nextInt(2) + ""));
            }
        }
        panel.setBounds(10, 10, 200, 200);
        f.add(panel);
        f.setSize(235, 255);
        f.setLayout(null);
        f.setVisible(true);
    }
}