package oop.characters;

public class Knight extends Hero {

    public Knight(String name) {
        super(150, 9, name);


    }

    @Override
    public void attack() {
        System.out.println("Mage attack!");
    }
}
