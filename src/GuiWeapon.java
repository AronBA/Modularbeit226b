import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GuiWeapon extends JFrame {

    private double damage;

    JLabel title = new JLabel();
    JPanel mainpanel = new JPanel();


    GuiWeapon(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");
        InputStream input1 = classLoader.getResourceAsStream("sword.png");
        InputStream input2 = classLoader.getResourceAsStream("enchantment.png");

        BufferedImage image = null;
        BufferedImage image1 = null;
        BufferedImage image2 = null;
        try {
            image = ImageIO.read(input);
            image1 = ImageIO.read(input1);
            image2 = ImageIO.read(input2);
        } catch (
            IOException e) {
            e.printStackTrace();
        }
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newimg);

        Image newimg1 = image1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(newimg1);

        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(newimg2);

        title.setText("Weapons");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon1);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);





        String[] weapons = {"WoodSword", "StoneSword", "IronSword", "GoldSword", "DiamondSword","NetheriteSword"};

        JComboBox<String> select = new JComboBox<>(weapons);
        select.setFont(new Font("Arial", Font.BOLD,20));

        SpinnerModel  value = new SpinnerNumberModel(0,0,5,1);
        JSpinner enchant = new JSpinner(value);
        enchant.setFont(new Font("Arial", Font.BOLD,20));

        JLabel centerlabel = new JLabel();
        centerlabel.setFont(new Font("Arial", Font.BOLD,20));
        centerlabel.setText("Sharpness Level");
        centerlabel.setIcon(icon2);
        centerlabel.setHorizontalAlignment(JLabel.CENTER);
        centerlabel.setVerticalAlignment(JLabel.CENTER);

        JButton submit = new JButton();
        submit.setText("submit");


        mainpanel.setLayout(new GridLayout(1,3,30,30));
        mainpanel.add(select, BorderLayout.CENTER);
        mainpanel.add(centerlabel);
        mainpanel.add(enchant, BorderLayout.SOUTH);
        mainpanel.setVisible(true);

        this.setTitle("Weapons");
        this.setIconImage(image);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(new BorderLayout(10,100));
        this.setResizable(false);
        this.add(title, BorderLayout.NORTH);
        this.add(mainpanel, BorderLayout.CENTER);
        this.add(submit, BorderLayout.SOUTH);


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sword1 = select.getItemAt(select.getSelectedIndex());
                int enchant1 = (Integer) enchant.getValue();

                Weapon w1 = new Weapon(sword1,enchant1);
                    setDamage(w1.getDamage());
                dispose();


            }
        });
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }
}
