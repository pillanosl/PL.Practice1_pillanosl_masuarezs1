package BeingsOfTheEarth;

import CreatorPackage.LivingBeings;

public class EarthAnimal extends LivingBeings implements EarthBeing {
    String type;
    String origin;

    public EarthAnimal(String type, String origin) {
        this.type = type;
        this.origin = origin;
    }


    public String getType() {
        return type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public void born() {

        System.out.println("Hello world, I'm a earth animal!");
    }

    @Override
    public void grow(int years) {
        System.out.println("The earth animal grew up " +years+ " years.");
    }


    @Override
    public void eat() {

        System.out.println("The earth animal is eating ñam, ñam.");
    }

    @Override
    public void respawn() {
        System.out.println("The earth animal gave birth to many children.");
    }

    @Override
    public void die() {

        System.out.println("The earth animal died...");
    }


    @Override
    public void walk() {

        System.out.println("The earth animal is walking home.");
    }


}
