package oop.characters;

public abstract class Character implements Attackable, Defensible {

    //    PROPERTIES ALL CHARACTERS SHARE
    protected int hp;
    protected int attackDamage;
    protected int spAttackDamage = 20;
    protected int defenseRegular;
    protected int spDefenseBlock = 15;

    public Character(int hp, int attackDamage, int defenseRegular) {
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defenseRegular = defenseRegular;
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

            System.out.println("Your health has deplenished to" + newHealth + " you may need to recover!");
        } else {

            System.out.println("Attacked for " + baseAttackDamage + " damage");
        }
    }

}
