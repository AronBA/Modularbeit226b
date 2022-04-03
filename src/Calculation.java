import java.util.Objects;

public class Calculation {

    Calculation(double damage, double defensepoints,double thougness,double protection){


        double totaldamage = damage * (1-Math.min(20, Math.max(defensepoints/5, defensepoints-(4*damage/(thougness+8)))/25)) * 1-(protection/25);


        double result = Math.round(totaldamage * 2.0) / 4.0;

        GuiResult resultGui = new GuiResult(result);








    }
}
