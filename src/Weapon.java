import java.util.Objects;

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
        } else if (sword.equals("DiamondSword")){
            basedamage = 7;
        } else if (sword.equals("NetheriteSword")){
            basedamage = 8;
        }

        double sharpness = 0.5 * (this.sharpnesslvl + 1);
        double damage;
        if (this.sharpnesslvl == 0){
            damage = basedamage;
        } else {
            damage = basedamage + sharpness;
        }
        return damage;
    }
}
