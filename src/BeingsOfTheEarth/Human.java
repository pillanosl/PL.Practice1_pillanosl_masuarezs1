package BeingsOfTheEarth;

import CreatorPackage.LivingBeings;
import SkyBeings.SkyBeing;

public class Human extends LivingBeings implements EarthBeing, SkyBeing {
    String name;
    String origin;

    public Human(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public void born() {
        System.out.println("Hello world, I'm a human!");
    }

    @Override
    public void grow(int years) {
        System.out.println("The human grew up " + years + " years.");
    }

    @Override
    public void eat() {
        System.out.println("The human is eating pizza ñam, ñam.");
    }

    @Override
    public void respawn() {
        System.out.println("The human gave birth to many children.");
    }

    @Override
    public void die() {
        System.out.println("The human passed away...");
    }

    @Override
    public void walk() {
        System.out.println("The human is walking to Carulla");
    }

    @Override
    public void fly() {
        System.out.println("the human is flying in an airplane...");
    }

    @Override
    public void changeDimensionChange() {
        System.out.println("The human is actually a reptilian and is changing dimension...");
    }

    @Override
    public void sing() {
        System.out.println("The human is singing Style by Taylor Swift.");

    }

}
