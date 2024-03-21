package SkyBeings;

import BeingsOfTheEarth.EarthBeing;
import CreatorPackage.LivingBeings;

public class SkyAnimal extends LivingBeings implements SkyBeing, EarthBeing {
    String type;
    String origin;

    public SkyAnimal(String type, String origin) {
        this.type = type;
        this.origin = origin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public void born() {
        System.out.println("Hello world, I'm a sky animal!");
    }

    @Override
    public void grow(int years) {
        System.out.println("The sky animal grew up in the sky " +years+ " years.");
    }

    @Override
    public void eat() {
        System.out.println("The sky animal is eating ñam, ñam.");
    }

    @Override
    public void respawn() {
        System.out.println("The sky animal gave birth to many children.");
    }

    @Override
    public void die() {
        System.out.println("The sky animal died...");
    }

    @Override
    public void fly() {
        System.out.println("The sky animal is flying!");
    }

    @Override
    public void changeDimensionChange() {
        System.out.println("The sky animal is actually from another planet and is changing dimension... ");
    }

    @Override
    public void sing() {
        System.out.println("The sky animal is singing!");
    }

    @Override
    public void walk() {
        System.out.println("The sky animal is walking on the ground...");
    }
}

