package SkyBeings;

import CreatorPackage.LivingBeings;

public class SkyAnimal extends LivingBeings implements SkyBeing {


    @Override
    public void born() {
        System.out.println("Hello world, I'm bird");
    }

    @Override
    public void grow(int years) {
        System.out.println("I grew up in the sky" +years+" months");
    }

    @Override
    public void eat() {
        System.out.println("Eating worms ñam, ñam");
    }

    @Override
    public void respawn() {
        System.out.println("I gave birth to ... birds");
    }

    @Override
    public void die() {
        System.out.println("Pajaro murio");
    }

    @Override
    public void fly() {
        System.out.println("volando");
    }

    @Override
    public void changeDimensionChange() {
        System.out.println("cambiando");
    }

    @Override
    public void sing() {
        System.out.println("Cantando pajaro");

    }
}

