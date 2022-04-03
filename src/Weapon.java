import java.util.Objects;

public class Weapon {

    private double damage;
    private int sharpnesslvl;
    private String sword;

    public Weapon(String sword, int sharpness) {
        this.sword = sword;
        this.sharpnesslvl = sharpness;
    }

    public double getDamage(){

        int basedamage = 0;
        if (Objects.equals(sword, "WoodSword") || Objects.equals(sword, "GoldSword")) {
            basedamage = 4;
        }
        else if (sword == "StoneSword"){
            basedamage = 5;
        }else if (sword == "IronSword"){
            basedamage = 6;
        } else if (sword == "DiamondSword"){
            basedamage = 7;
        } else if (sword == "NetheriteSword"){
            basedamage = 8;
        }

        double sharpness = 0.5 * (this.sharpnesslvl + 1);
        if (this.sharpnesslvl == 0){
            damage = basedamage;
        } else {
            damage = basedamage + sharpness;
        }
        return damage;
    }
}
