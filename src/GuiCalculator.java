import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * This Class inherits the Gui Class. Its used to Display the main Calculator Gui.
 **/

public class GuiCalculator extends Gui{

    private GuiWeapon guiWeapon;
    private GuiArmor guiArmor;

    //important objects like the label or the panel are defined here.
    JLabel title = new JLabel();
    JPanel mainpanel = new JPanel();
    JButton weapon = new JButton();
    JButton armor = new JButton();
    JLabel arrow = new JLabel();

    GuiCalculator() {

        //the class loader is used to load all the images from the resource folder
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
            assert input != null;
            image = ImageIO.read(input);
            assert input1 != null;
            image1 = ImageIO.read(input1);
            assert input2 != null;
            image2 = ImageIO.read(input2);
            assert input3 != null;
            image3 = ImageIO.read(input3);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //resizing of the images
        assert image != null;
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newimg);

        assert image1 != null;
        Image newimg1 = image1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(newimg1);

        assert image2 != null;
        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(newimg2);

        assert image3 != null;
        Image newimg3 = image3.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon3 = new ImageIcon(newimg3);

        //the title label is defined here
        title.setText("Calculator");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);

        //the weapon label is defined here
        weapon.setFont(new Font("Arial", Font.BOLD,20));
        weapon.setText("Weapon");
        weapon.setIcon(icon1);

        //the armor label is defined here
        armor.setFont(new Font("Arial", Font.BOLD,20));
        armor.setText("Armor");
        armor.setIcon(icon2);

        //the arrow label (the on in the center of the screen) is defined here
        arrow.setFont(new Font("Arial", Font.BOLD,20));
        arrow.setText("Attacks");
        arrow.setIcon(icon3);
        arrow.setIconTextGap(-150);
        arrow.setHorizontalAlignment(JLabel.CENTER);
        arrow.setVerticalAlignment(JLabel.CENTER);

        //the main panel is defined here. It has a gridlayout for an easy layout
        mainpanel.setLayout(new GridLayout(1,2,30,30));
        mainpanel.add(weapon);
        mainpanel.add(arrow);
        mainpanel.add(armor);
        mainpanel.setVisible(true);

        JButton submit = new JButton();
        submit.setText("Calculate");

        //here is the gui Defined. Its using a Borderlayout, with the mainpanel in the center, the title on the top and the submitbutton on the bottom as well as two Separators on each side.
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(100,170));
        this.setSize(getWidth(), getHeight());
        this.setResizable(false);
        this.setIconImage(image);
        this.setLocationRelativeTo(null);

        this.add(title, BorderLayout.NORTH);
        this.add(new JSeparator(), BorderLayout.WEST);
        this.add(new JSeparator(), BorderLayout.EAST);
        this.add(submit, BorderLayout.SOUTH);
        this.add(mainpanel, BorderLayout.CENTER);


        //action listener which shows to armor gui.
        armor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            GuiArmor g2 = new GuiArmor();;
            g2.setVisible(true);
            setGuiArmor(g2);
            }
        });

        //action listener which shows to weapon gui.
        weapon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                GuiWeapon g1 = new GuiWeapon();
                g1.setVisible(true);
               setGuiWeapon(g1);
            }
        });

        //action listener which calculates the result. If nothing is choosen it will create a little warning message.
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    Calculation c1 = new Calculation(getGuiWeapon().getDamage(),getGuiArmor().getDefensepoints(),getGuiArmor().getToughness(),getGuiArmor().getProtection(),getGuiWeapon().getAtackspeed());
                } catch (NullPointerException exception){
                    JOptionPane.showMessageDialog(new JFrame(), "Please choose weapon and armor","Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    //getter and setter for the class
    public GuiArmor getGuiArmor() {
        return guiArmor;
    }

    public GuiWeapon getGuiWeapon() {
        return guiWeapon;
    }

    public void setGuiArmor(GuiArmor guiArmor) {
        this.guiArmor = guiArmor;
    }

    public void setGuiWeapon(GuiWeapon guiWeapon) {
        this.guiWeapon = guiWeapon;
    }
}
