public class Calculation {
    /**
     * This Class is used to do all the math and creates a new resultGui Object
     **/

    Calculation(double damage, double defensepoints,double toughness,double protection,double attackspeed){


        // This simple formular calculates the total damage. The damage reduction increases with increasing damage input.
        double total = damage * (1-Math.min(20, Math.max(defensepoints/5, defensepoints-(4*damage/(toughness+8)))/25)) * 1-(protection/25);
        double result = Math.round(total * 2.0) / 4.0;

        //This formular calculates the damage if the player crits.
        double crit = result * 1.5;

        //This formular calculates the minimal and maximal hits until a player dies.
        double minhits = 10 / result;
        double minhittodeath = Math.ceil(minhits);
        double maxhits = 10 / crit;
        double maxhittodeath = Math.ceil(maxhits);


        //This formular calculates the minimal possible damage per second and rounds down to two digits after the comma.
        double mindps = result * attackspeed;
        mindps = mindps*100;
        mindps = (double)((int) mindps);
        mindps = mindps /100;

        //This formular calculates the maximal possible damage per second and rounds down to two digits after the comma.
        double maxdps = crit * attackspeed;
        maxdps = maxdps*100;
        maxdps = (double)((int) maxdps);
        maxdps = maxdps /100;

        //New resultGui Object with all the results
        GuiResult resultGui = new GuiResult(result,crit,minhittodeath,maxhittodeath,mindps,maxdps);
    }
}
