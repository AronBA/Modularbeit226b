import java.util.Objects;

public class Armor {

    private final double toughness;
    private final double protectionlvl;
    private final double defensepoints;

    public Armor(String armor, double protectionlvl) {

        double toughness = 0;
        double defensepoints = 0;
        if (Objects.equals(armor, "LeatherArmor")) {
            defensepoints = 7;
        }
        else if (armor.equals("ChainmailArmor")){
            defensepoints = 11;
        }else if (armor.equals("IronArmor")){
            defensepoints = 12;
        } else if (armor.equals("GoldArmor")){
            defensepoints = 15;
        } else if (armor.equals("DiamondArmor")){
            defensepoints = 20;
            toughness = 8;
        } else if (armor.equals("NetheriteArmor")){
            defensepoints = 20;
            toughness = 12;
        } else if (armor.equals("noArmor")){
            toughness = 0;
            defensepoints = 0;
        }

        this.defensepoints = defensepoints;
        this.protectionlvl = protectionlvl;
        this.toughness = toughness;
    }

    public double getToughness() {
        return toughness;
    }

    public double getDefensepoints() {
        return defensepoints;
    }

    public double getProtectionlvl() {
        return protectionlvl;
    }
}
