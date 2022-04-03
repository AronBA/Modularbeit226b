
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

    private double damage;
    private double protection;
    private double thougness;
    private double defensepoints;

    JLabel title = new JLabel();
    JPanel mainpanel = new JPanel();
    JButton weapon = new JButton();
    JButton armor = new JButton();
    JLabel arrow = new JLabel();


    GuiCalculator() {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");
        InputStream input1 = classLoader.getResourceAsStream("sword.png");
        InputStream input2 = classLoader.getResourceAsStream("chest.png");
        InputStream input3 = classLoader.getResourceAsStream("arrow.png");

        BufferedImage image = null;
        BufferedImage image1 = null;
        BufferedImage image2 = null;
        BufferedImage image3 = null;
        try {
            image = ImageIO.read(input);
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);
            image3 = ImageIO.read(input3);

        } catch (IOException e) {
            e.printStackTrace();
        }
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newimg);

        Image newimg1 = image1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(newimg1);

        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(newimg2);

        Image newimg3 = image3.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon3 = new ImageIcon(newimg3);

        title.setText("Calculator");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);

        weapon.setFont(new Font("Arial", Font.BOLD,20));
        weapon.setText("Weapon");
        weapon.setIcon(icon1);

        armor.setFont(new Font("Arial", Font.BOLD,20));
        armor.setText("Armor");
        armor.setIcon(icon2);

        arrow.setFont(new Font("Arial", Font.BOLD,20));
        arrow.setText("Attacks");
        arrow.setIcon(icon3);
        arrow.setIconTextGap(-150);
        arrow.setHorizontalAlignment(JLabel.CENTER);
        arrow.setVerticalAlignment(JLabel.CENTER);

        mainpanel.setLayout(new GridLayout(1,2,30,30));
        mainpanel.add(weapon);
        mainpanel.add(arrow);
        mainpanel.add(armor);
        mainpanel.setVisible(true);

        JButton submit = new JButton();
        submit.setText("Calculate");

        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(100,170));
        this.setSize(getW(), getH());
        this.setResizable(false);
        this.setIconImage(image);

        this.add(title, BorderLayout.NORTH);
        this.add(new JSeparator(), BorderLayout.WEST);
        this.add(new JSeparator(), BorderLayout.EAST);
        this.add(submit, BorderLayout.SOUTH);
        this.add(mainpanel, BorderLayout.CENTER);

        armor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            GuiArmor g2 = new GuiArmor();
            g2.setVisible(true);
            setDefensepoints(g2.getDefensepoints());
            setProtection(g2.getProtection());
            setThougness(g2.getThougness());
                System.out.println(getDefensepoints());
                System.out.println(getProtection());
                System.out.println(getThougness());
            }
        });

        weapon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                GuiWeapon g1 = new GuiWeapon();
                g1.setVisible(true);
                setDamage(g1.getDamage());
                System.out.println(getDamage());
            }
        });

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculation c1 = new Calculation(getDamage(),getDefensepoints(),getThougness(),getProtection());
            }
        });

    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setDefensepoints(double defensepoints) {
        this.defensepoints = defensepoints;
    }

    public void setProtection(double protection) {
        this.protection = protection;
    }

    public void setThougness(double thougness) {
        this.thougness = thougness;
    }

    public double getDamage() {
        return damage;
    }

    public double getDefensepoints() {
        return defensepoints;
    }

    public double getProtection() {
        return protection;
    }

    public double getThougness() {
        return thougness;
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
