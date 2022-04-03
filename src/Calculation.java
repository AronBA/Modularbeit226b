public class Calculation {

    Calculation(double damage, double defensepoints,double toughness,double protection){

        double total = damage * (1-Math.min(20, Math.max(defensepoints/5, defensepoints-(4*damage/(toughness+8)))/25)) * 1-(protection/25);
        double result = Math.round(total * 2.0) / 4.0;

        GuiResult resultGui = new GuiResult(result);
    }
}
