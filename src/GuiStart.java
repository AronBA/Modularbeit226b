import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

/**
 * This Class is used for the loading Screen, which is completely unnecessary but cool.
 **/

public class GuiStart extends JFrame {

    ImageIcon icon;
    JFrame frame;
    JProgressBar progressBar = new JProgressBar();
    JLabel message = new JLabel();//Crating a JLabel for displaying the message

    GuiStart() {
        loadicon();
        createGUI();
        addImage();
        addProgressBar();
        addMessage();
        runningPBar();

    }

    public void createGUI() {

        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void addImage() {
        JLabel image = new JLabel(icon);
        image.setSize(400, 300);
        frame.add(image);

    }

    public void addMessage() {
        message.setBounds(150, 320, 200, 40);//Setting the size and location of the label
        message.setFont(new Font("Arial", Font.BOLD, 15));//Setting font properties
        frame.add(message);//adding label to the frame
    }

    public void addProgressBar() {
        progressBar.setBounds(50, 280, 300, 30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(new Color(0x5B5BA9));
        progressBar.setValue(0);
        frame.add(progressBar);
    }

    //function for running the progressbar
    public void runningPBar() {
        int i = 0;//Creating an integer variable and intializing it to 0

        while (i <= 100) {
            try {
                Thread.sleep(10);//Pausing execution for 10 milliseconds
                progressBar.setValue(i);//Setting value of Progress Bar
                message.setText("LOADING " + i + "%");//Setting text of the message JLabel

                i++;
                if (i == 100)
                    break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        frame.dispose();
        GuiCalculator g1 = new GuiCalculator();
        g1.setVisible(true);
    }

    //function for loading the icon out of the resource folder
    public void loadicon() {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("logo.png");
        BufferedImage image = null;

        try {
            assert input != null;
            image = ImageIO.read(input);

        } catch (IOException e) {
            e.printStackTrace();
        }
        assert image != null;
        Image newimg = image.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
        this.icon = new ImageIcon(newimg);

    }
}
