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

        String[] weapons = {"WoodSword", "StoneSword", "IronSword", "GoldSword", "DiamondSword","NetheriteSword"};

        JComboBox<String> weapon = new JComboBox<>(weapons);
        weapon.setBounds(80, 50, 140, 20);

        String[] armors = {"noArmor","LeatherArmor", "ChainmailArmor", "IronArmor", "GoldArmor", "DiamondArmor","NetheriteArmor"};

        JComboBox<String> armor = new JComboBox<>(armors);
        armor.setBounds(80, 50, 140, 20);

        Integer[] sharpness = {0,1,2,3,4,5};

        JComboBox<Integer> sharp = new JComboBox<>(sharpness);
        sharp.setBounds(80, 50, 140, 20);


        JComboBox<Integer> prot = new JComboBox<>(sharpness);
        weapon.setBounds(80, 50, 140, 20);

        JButton submit = new JButton("Calculate!");

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
        this.add(new JPanel());
        this.add(weapon);
        this.add(new JPanel());
        this.add(armor);
        this.add(new JPanel());
        this.add(new JPanel());
        this.add(sharp);
        this.add(new JPanel());
        this.add(prot);
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
                String sword1 = weapon.getItemAt(weapon.getSelectedIndex());
                int slvl1 = sharp.getItemAt(sharp.getSelectedIndex());
                String armor1 = armor.getItemAt(armor.getSelectedIndex());
                int alvl1 = prot.getItemAt(prot.getSelectedIndex());

                Calculation cal = new Calculation(sword1,slvl1,armor1,alvl1);



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
