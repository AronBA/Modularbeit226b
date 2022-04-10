import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This Class is the Parent Class of all Guis.
 * It also defines the actionPerformed function wich is necessary for all the child Classes if they want to use an ActionListener.
 * getHeight as well as getWidth defines the Size of all the Guis
 **/

public class Gui extends JFrame implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public int getHeight() {
        return 600;
    }

    @Override
    public int getWidth() {
        return 1000;
    }

}
