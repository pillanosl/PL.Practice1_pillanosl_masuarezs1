package BeingsOfTheEarth;

import CreatorPackage.LivingBeings;

public class EarthAnimal extends LivingBeings implements EarthBeing {


    @Override
    public void born() {
        System.out.println("Hello world, I'm Kitty");
    }

    @Override
    public void grow(int years) {
        System.out.println("I grew up" +years+" months");
    }

    @Override
    public void respawn() {
        System.out.println("I gave birth to ... kitties");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat ñam");
    }

    @Override
    public void die() {
        System.out.println("Kitten died");
    }

    @Override
    public void fly() {

    }

    @Override
    public void changeDimensionChange() {

    }

    @Override
    public void sing() {

    }

    @Override
    public void walk() {
        System.out.println("Walking miau, miau");
    }
}

