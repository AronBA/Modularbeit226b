import java.util.Objects;

/**
 * This Class converts the GUI input into numbers wich can be used for the Calculation
 **/

public class Weapon {

    private final int sharpnesslvl;
    private final String sword;

    public Weapon(String sword, int sharpness) {
        this.sword = sword;
        this.sharpnesslvl = sharpness;
    }

    public double getDamage(){

        int basedamage = 0;
        if (Objects.equals(sword, "WoodSword") || Objects.equals(sword, "GoldSword")) {
            basedamage = 4;
        }
        else if (sword.equals("StoneSword")){
            basedamage = 5;
        }else if (sword.equals("IronSword")){
            basedamage = 6;
        } else if (sword.equals("DiamondSword") || sword.equals("WoodenAxe") || sword.equals("GoldAxe")) {
            basedamage = 7;
        } else if (sword.equals("NetheriteSword")){
            basedamage = 8;
        } else if (sword.equals("StoneAxe") || sword.equals("IronAxe") || sword.equals("DiamondAxe")){
            basedamage = 9;
        } else if (sword.equals("NetheriteAxe")){
            basedamage = 10;
        }

        double sharpness = 0.5 * (this.sharpnesslvl + 0.5);
        double damage;
        if (this.sharpnesslvl == 0){
            damage = basedamage;
        } else {
            damage = basedamage + sharpness;
        }
        return damage;
    }
    public double getAttackspeed(){
        double attackspeed = 0;

        if (Objects.equals(sword, "WoodSword") || Objects.equals(sword, "GoldSword") || sword.equals("StoneSword") || sword.equals("DiamondSword") || sword.equals("NetheriteSword") || sword.equals("IronSword")) {
            attackspeed = 1.6;
        } else if (sword.equals("WoodenAxe") || sword.equals("StoneAxe")) {
            attackspeed = 0.8;
        } else if (sword.equals("IronAxe")){
            attackspeed = 0.9;
        }else if (sword.equals("GoldAxe") || sword.equals("DiamondAxe") ||sword.equals("NetheriteAxe")){
            attackspeed = 1;
        }

        return attackspeed;
    }
}
