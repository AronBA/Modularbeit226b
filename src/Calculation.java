import java.util.Objects;

public class Calculation {

    Calculation(String sword, int slvl, String armor, int alvl){


        int basedmg = 1;
        double defensepoints = 0;
        int thougness = 0;

        if (Objects.equals(armor, "LeatherArmor")) {
            defensepoints = 7;
        }
        else if (armor == "ChainmailArmor"){
            defensepoints = 11;
        }else if (armor == "IronArmor"){
            defensepoints = 12;
        } else if (armor == "GoldArmor"){
            defensepoints = 15;
        } else if (armor == "DiamondArmor"){
            defensepoints = 20;
            thougness = 8;
        } else if (armor == "NetheriteArmor"){
            defensepoints = 20;
            thougness = 12;
        }

        if (Objects.equals(sword, "WoodSword") || Objects.equals(sword, "GoldSword")) {
            basedmg = 4;
        }
        else if (sword == "StoneSword"){
            basedmg = 5;
        }else if (sword == "IronSword"){
            basedmg = 6;
        } else if (sword == "DiamondSword"){
            basedmg = 7;
        } else if (sword == "NetheriteSword"){
            basedmg = 8;
        }


        double weapondamage;
        double sharpness = 0.5 * (slvl + 1);
        if (slvl == 0){
             weapondamage = basedmg;
        } else {
             weapondamage = basedmg + sharpness;
        }


        double result = weapondamage * (1-Math.min(20, Math.max(defensepoints/5, defensepoints-(4*weapondamage/(thougness+8)))/25)) * 1-(alvl/25);


        GuiResult resultGui = new GuiResult(result);







    }
}
