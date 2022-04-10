import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * This Class inherits the Gui Class. Its used to Display the Result Gui.
 **/

public class GuiResult extends Gui {

    GuiResult(double damage,double crit,double minhittodeath,double maxhittodeath,double mindps, double maxdps) {

        //classloader is used to load all the images from the resource folder
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");

        BufferedImage image = null;

        try {
            assert input != null;
            image = ImageIO.read(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //resizing of the image
        assert image != null;
        Image newimg = image.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newimg);


        //title for the result gui
        JLabel title = new JLabel();
        title.setText("Calculator");
        title.setFont(new Font("Arial", Font.BOLD,20));
        title.setIcon(icon);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalTextPosition(JLabel.RIGHT);
        title.setVerticalTextPosition(JLabel.CENTER);

        //JTable for displaying the result.

        String result[][]={ {damage + " ♡", crit  + " ♡", String.valueOf(minhittodeath), String.valueOf(maxhittodeath), mindps + " ♡", maxdps + " ♡"}};
        String column[]={"Damage(Flat)","Damage(Crit)","max Hits until Death","min Hits until Death","min Dps","max Dps"};
        JTable resulttable =new JTable(result,column);
        resulttable.setBounds(30,40,150,200);
        JScrollPane resultpane = new JScrollPane(resulttable);

        //Here is the Gui defined. All the components are added.
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(new GridLayout(3,1,20,20));
        this.setSize(getWidth(), getHeight());
        this.setResizable(false);
        this.setIconImage(image);
        this.add(title);
        this.add(resultpane);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
