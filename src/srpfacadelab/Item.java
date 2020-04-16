package srpfacadelab;

import java.util.List;

public class Item {

    private int id;

    private String name;

    // How much the item heals by.
    private int heal;

    // How much armour the player gets when it is equipped.
    private int armour;

    // How much this item weighs in pounds.
    private int weight;

    // A unique item can only be picked up once.
    private boolean unique;

    // Rare items are shiny
    private final boolean rare;

    public Item(int id, String name, int heal, int armour, int weight, boolean unique, boolean rare)
    {
        this.rare = rare;
        this.setName(name);
        this.setHeal(heal);
        this.setArmour(armour);
        this.setWeight(weight);
        this.setUnique(unique);
        this.setId(id);
    }

    public void useItem(SimpleGameEngine sg, RpgPlayer player) {
        if (getName().equals("Stink Bomb"))
        {
            List<IEnemy> enemies = sg.getEnemiesNear(player);

            for (IEnemy enemy: enemies){
                enemy.takeDamage(100);
            }
        }
    }

    public boolean pickUpItem(RpgPlayer player, SimpleGameEngine sg) {
        if (player.calculateInventoryWeight() + getWeight() > player.getCarryingCapacity())
            return false;

        if (unique && player.checkIfItemExistsInInventory(this))
            return false;

        if (rare && unique)
            sg.playSpecialEffect("blue_swirly");

        // Don't pick up items that give health, just consume them.
        if (heal > 0) {
            player.setHealth(player.getHealth() + heal);

            if (player.getHealth() > player.getMaxHealth())
                player.setHealth(player.getMaxHealth());

            if (heal > 500) {
                sg.playSpecialEffect("green_swirly");
            }

            return true;
        }

        if (rare)
            sg.playSpecialEffect("cool_swirly_particles");

        player.addToInventory(this);

        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public boolean isRare() {
        return rare;
    }
}
