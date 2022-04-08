import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GuiResult extends Gui {

    GuiResult(double damage,double crit,double minhittodeath,double maxhittodeath,double mindps, double maxdps) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");
        InputStream input2 = classLoader.getResourceAsStream("heart.png");
        InputStream input3 = classLoader.getResourceAsStream("skelett.png");

        BufferedImage image = null;
        BufferedImage image2 = null;
        BufferedImage image3 = null;
        try {
            assert input != null;
            image = ImageIO.read(input);
            assert input2 != null;
            image2 = ImageIO.read(input2);
            assert input3 != null;
            image3 = ImageIO.read(input3);

        } catch (IOException e) {
            e.printStackTrace();
        }
        assert image != null;
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newimg);

        assert image2 != null;
        Image newimg2 = image2.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(newimg2);

        assert image3 != null;
        Image newimg3 = image3.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon3 = new ImageIcon(newimg3);

        JLabel title = new JLabel();
        title.setText("Calculator");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);


        JLabel result = new JLabel();
        result.setText(String.valueOf(damage));
        result.setIcon(icon2);
        result.setFont(new Font("Arial", Font.BOLD,20));
        result.setHorizontalAlignment(JLabel.CENTER);
        result.setVerticalAlignment(JLabel.CENTER);
        result.setHorizontalTextPosition(JLabel.RIGHT);
        result.setVerticalTextPosition(JLabel.CENTER);





        String data[][]={ {damage + " ♡", crit  + " ♡", String.valueOf(minhittodeath), String.valueOf(maxhittodeath), mindps + " ♡", maxdps + " ♡"}};

        String column[]={"Damage(Flat)","Damage(Crit)","min Hits until Death","max Hits until Death","min Dps","max Dps"};
        JTable resulttable =new JTable(data,column);
        resulttable.setBounds(30,40,150,200);
        JScrollPane p = new JScrollPane(resulttable);



            this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(new GridLayout(3,1,20,20));
        this.setSize(getWidth(), getHeight());
        this.setResizable(false);
        this.setIconImage(image);
        this.add(title);
        this.add(p);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
