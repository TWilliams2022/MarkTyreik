package oop.characters;

public class Mage extends Hero {

    public Mage(int hp, int attackDamage, String name) {
        super(hp, attackDamage, name);


    }

    @Override
    public void attack() {
        System.out.println("Mage attack!");
    }
}
