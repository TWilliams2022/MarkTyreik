package oop.characters;

public abstract class Character implements Attackable {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp = 100;
    protected int attackDamage = 5;
    protected int spAttackDamage = 20;
    protected int defenseRegular = 3;
    protected int spDefenseBlock = 15;

    public Character(int hp, int attackDamage) {
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    //getter setter

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getDefenseRegular() {
        return defenseRegular;
    }

    public void setDefenseRegular(int defenseRegular) {
        this.defenseRegular = defenseRegular;
    }

    //    BEHAVIORS THAT ALL CHARACTERS SHARE
    public void attack() {
        if (attackDamage > baseAttackDamage) {
            System.out.println("Attacked for " + attackDamage + " damage");
        } else {
            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

    public void hp() {
        if (attackDamage > baseAttackDamage) {

          int newHealth = hp - attackDamage;

            System.out.println("Your health has deplenished to" + newHealth+ " you may need to recover!");
        } else {

            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

}
