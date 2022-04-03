
import javax.imageio.ImageIO;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

            com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme.setup();
            GuiCalculator guiCalculator = new GuiCalculator();
            guiCalculator.setVisible(true);







    }
}
