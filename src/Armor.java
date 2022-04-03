import java.util.Objects;

public class Armor {

    private double thougness;
    private int protectionlvl;
    private int defensepoints;

    public Armor(String armor, int protectionlvl) {

        thougness = 0;
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


        this.defensepoints = defensepoints;
        this.protectionlvl = protectionlvl;
        this.thougness = thougness;
    }

    public double getThougness() {
        return thougness;
    }

    public int getDefensepoints() {
        return defensepoints;
    }

    public int getProtectionlvl() {
        return protectionlvl;
    }
}
