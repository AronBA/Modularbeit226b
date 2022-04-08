public class Calculation {

    Calculation(double damage, double defensepoints,double toughness,double protection,double attackspeed){

        double total = damage * (1-Math.min(20, Math.max(defensepoints/5, defensepoints-(4*damage/(toughness+8)))/25)) * 1-(protection/25);
        double result = Math.round(total * 2.0) / 4.0;

        double crit = Math.floor(result * 1.5);

        double minhits = 10 / result;
        double minhittodeath = Math.ceil(minhits);
        double maxhits = 10 / crit;
        double maxhittodeath = Math.ceil(maxhits);



        double mindps = result * attackspeed;
        mindps = mindps*100;
        mindps = (double)((int) mindps);
        mindps = mindps /100;

        double maxdps = crit * attackspeed;
        maxdps = maxdps*100;
        maxdps = (double)((int) maxdps);
        maxdps = maxdps /100;






        GuiResult resultGui = new GuiResult(result,crit,minhittodeath,maxhittodeath,mindps,maxdps);
    }
}
