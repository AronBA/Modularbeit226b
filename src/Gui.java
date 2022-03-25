import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Gui extends JFrame {
    private int h = 600;
    private int w = 1000;

    JLabel title = new JLabel();


    Gui() {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");

        BufferedImage image = null;
        try {
            image = ImageIO.read(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newimg);

        title.setText("Calculator");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);


        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,5,20,20));
        this.setSize(getW(), getH());
        this.setResizable(false);
        this.setIconImage(image);
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(title);
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(new JButton("Weapon"));
        this.add(new JLabel("X"));
        this.add(new JButton("Enchantments"));
        this.add(new JLabel("X"));
        this.add(new JButton("Effects"));
        this.add(new JButton("Armor"));
        this.add(new JLabel("X"));
        this.add(new JButton("Enchantments"));
        this.add(new JLabel("X"));
        this.add(new JButton("Effects"));
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(new JButton("Calculate!"));
        this.add(new JPanel());
        this.add(new JPanel());

        this.setVisible(true);

    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }
}
