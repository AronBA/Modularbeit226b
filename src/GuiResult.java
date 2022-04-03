import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GuiResult extends JFrame implements ActionListener  {

    GuiResult(double results) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");
        InputStream input2 = classLoader.getResourceAsStream("heart.png");

        BufferedImage image = null;
        BufferedImage image2 = null;
        try {
            assert input != null;
            image = ImageIO.read(input);
            assert input2 != null;
            image2 = ImageIO.read(input2);

        } catch (IOException e) {
            e.printStackTrace();
        }
        assert image != null;
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newimg);

        assert image2 != null;
        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(newimg2);

        JLabel title = new JLabel();
        title.setText("Calculator");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);

        JLabel result = new JLabel();
        result.setText(String.valueOf(results));
        result.setIcon(icon2);
        result.setFont(new Font("Arial", Font.BOLD,20));
        result.setHorizontalAlignment(JLabel.CENTER);
        result.setVerticalAlignment(JLabel.CENTER);
        result.setHorizontalTextPosition(JLabel.RIGHT);
        result.setVerticalTextPosition(JLabel.CENTER);

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(new GridLayout(2,1,20,20));
        this.setSize(getW(), getH());
        this.setResizable(false);
        this.setIconImage(image);
        this.add(title);
        this.add(result);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public int getH() {
        return 600;
    }
    public int getW() {
        return 1000;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
