package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage > 100 ? 100 : Math.max(healthPercentage, 0);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Player(String name, int healthPercentage, Weapon weapon){
        setWeapon(weapon);
        setName(name);
        setHealthPercentage(healthPercentage);
    }


    public int healthRemaining() {
        return getHealthPercentage();
    }

    public void loseHealth(int damage) {
        if(getHealthPercentage() - damage <= 0){
            setHealthPercentage(0);
            showKnockOutMessage();
        }else {
            setHealthPercentage(getHealthPercentage() - damage);
        }
    }

    public void restoreHealth(int healthPotion) {
        setHealthPercentage(getHealthPercentage() + healthPotion);
    }

    private void showKnockOutMessage(){
        System.out.println(getName() + " player has been knocked out of game");
    }
}
