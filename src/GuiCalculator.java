import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GuiCalculator extends JFrame implements ActionListener{
    private int h = 600;
    private int w = 1000;


    JLabel title = new JLabel();


    GuiCalculator() {


        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");
        InputStream input1 = classLoader.getResourceAsStream("sword.png");
        InputStream input2 = classLoader.getResourceAsStream("chest.png");


        BufferedImage image = null;
        BufferedImage image1 = null;
        BufferedImage image2 = null;
        try {
            image = ImageIO.read(input);
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newimg);

        Image newimg1 = image1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(newimg1);

        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(newimg2);

        title.setText("Calculator");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);

        JButton weapon = new JButton();
        weapon.setFont(new Font("Arial", Font.BOLD,20));
        weapon.setText("Weapon");
        weapon.setIcon(icon1);

        JButton armor = new JButton();
        armor.setFont(new Font("Arial", Font.BOLD,20));
        armor.setText("Armor");
        armor.setIcon(icon2);



        JButton submit = new JButton("Calculate!");
        submit.setFont(new Font("Arial", Font.BOLD,20));


        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,5,10,10));
        this.setSize(getW(), getH());
        this.setResizable(false);
        this.setIconImage(image);
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(title);
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(weapon);
        this.add(new JPanel());
        this.add(armor);
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(submit);
        this.add(new JPanel());
        this.add(new JPanel());


        this.setVisible(true);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });






    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
