import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * This Class inherits the Gui Class. Its used to Display the Weapon Selection Gui.
 **/

public class GuiWeapon extends Gui {

    private double damage = 0;
    private double attackspeed = 0;

    GuiWeapon(){
        // class loader is used for loading the images from the resource folder
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");
        InputStream input1 = classLoader.getResourceAsStream("sword.png");
        InputStream input2 = classLoader.getResourceAsStream("enchantment.png");

        BufferedImage image = null;
        BufferedImage image1 = null;
        BufferedImage image2 = null;
        try {
            assert input != null;
            image = ImageIO.read(input);
            assert input1 != null;
            image1 = ImageIO.read(input1);
            assert input2 != null;
            image2 = ImageIO.read(input2);
        } catch (
            IOException e) {
            e.printStackTrace();
        }
        //resizing of the images

        assert image1 != null;
        Image newimg1 = image1.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon1 = new ImageIcon(newimg1);

        assert image2 != null;
        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(newimg2);

        //creating the title
        JLabel title = new JLabel();
        title.setText("Weapons");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon1);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);

        String[] weapons = {"WoodSword", "StoneSword", "IronSword", "GoldSword", "DiamondSword","NetheriteSword","WoodenAxe","GoldAxe","StoneAxe","IronAxe","DiamondAxe","NetheriteAxe"};

        JComboBox<String> select = new JComboBox<>(weapons);
        select.setFont(new Font("Arial", Font.BOLD,20));

        SpinnerModel  value = new SpinnerNumberModel(0,0,5,1);
        JSpinner enchant = new JSpinner(value);
        enchant.setFont(new Font("Arial", Font.BOLD,20));

        //The Center label is the label in the center rof the gui
        JLabel centerlabel = new JLabel();
        centerlabel.setFont(new Font("Arial", Font.BOLD,20));
        centerlabel.setText("Sharpness Level");
        centerlabel.setIcon(icon2);
        centerlabel.setHorizontalAlignment(JLabel.CENTER);
        centerlabel.setVerticalAlignment(JLabel.CENTER);

        //The Center label is the label in the center of the gui
        JButton submit = new JButton();
        submit.setText("submit");

        //the mainpanel object is a JPanel with a Gridlayout. All the main components of the UI are added here for a better Layout
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new GridLayout(1,3,30,30));
        mainpanel.add(select, BorderLayout.CENTER);
        mainpanel.add(centerlabel);
        mainpanel.add(enchant, BorderLayout.SOUTH);
        mainpanel.setVisible(true);

        //here is the gui Defined. Its using a Borderlayout, with the mainpanel in the center, the title on the top and the submitbutton on the bottom
        this.setTitle("Weapons");
        this.setIconImage(image);
        this.setSize(getWidth(),getHeight());
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(new BorderLayout(10,100));
        this.setResizable(false);
        this.add(title, BorderLayout.NORTH);
        this.add(mainpanel, BorderLayout.CENTER);
        this.add(submit, BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);


        // This ActionListener creates a new weapon Class which converts all Selected Items into Values. It also gets via the getter the Values from the weapon Class. Finally it disposes the Window.
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sword1 = select.getItemAt(select.getSelectedIndex());
                int enchant1 = (Integer) enchant.getValue();

                Weapon w1 = new Weapon(sword1,enchant1);
                setDamage(w1.getDamage());
                setAttackspeed(w1.getAttackspeed());
                dispose();
            }
        });
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setAttackspeed(double attackspeed) {
        this.attackspeed = attackspeed;
    }

    public double getDamage() {
        return damage;
    }
    public double getAtackspeed(){
        return attackspeed;
    }
}
