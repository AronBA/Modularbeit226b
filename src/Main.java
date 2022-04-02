
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme.setup();
        } catch (NoClassDefFoundError e){
            JOptionPane.showMessageDialog(new JFrame("Info"), "flatlaf plugin not found");
        }
        finally {
            GuiCalculator guiCalculator = new GuiCalculator();
        }




    }
}
