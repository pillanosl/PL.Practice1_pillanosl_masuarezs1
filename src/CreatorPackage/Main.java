package CreatorPackage;

import BeingsOfTheEarth.EarthAnimal;
import BeingsOfTheEarth.Human;
import SkyBeings.SkyAnimal;

public class Main {
    public static void main(String[] args) {

        LivingBeingsCreator ser1 = new LivingBeingsCreator();
        Human human1 = (Human) ser1.createLivingBeings("Human");
        int i = (int) (Math.random() * 4);
        System.out.println("Human called " +human1.getName()+" from "+ human1.getOrigin()+".");
        human1.born();
        human1.grow(i*2);
        human1.respawn();
        human1.eat();
        human1.walk();
        human1.sing();
        human1.changeDimensionChange();
        human1.die();
        System.out.println("\n");

        LivingBeingsCreator ser2 = new LivingBeingsCreator();
        SkyAnimal SkyAni = (SkyAnimal) ser2.createLivingBeings("SkyAnimal");
        System.out.println("SkyAnimal type " +SkyAni.getType()+" from "+ SkyAni.getOrigin()+".");
        SkyAni.born();
        SkyAni.grow(i+1);
        SkyAni.sing();
        SkyAni.fly();
        SkyAni.walk();
        SkyAni.eat();
        SkyAni.respawn();
        SkyAni.changeDimensionChange();
        SkyAni.die();
        System.out.println("\n");

        LivingBeingsCreator ser3 = new LivingBeingsCreator();
        EarthAnimal EarthAni = (EarthAnimal) ser3.createLivingBeings("EarthAnimal");
        System.out.println("Earth animal type " +EarthAni.getType()+" from "+EarthAni.getOrigin()+".");
        EarthAni.born();
        EarthAni.walk();
        EarthAni.grow(i+2);
        EarthAni.respawn();
        EarthAni.eat();
        EarthAni.die();

    }
}
