package CreatorPackage;

import BeingsOfTheEarth.EarthAnimal;
import BeingsOfTheEarth.Human;
import SkyBeings.SkyAnimal;

public class Main {
    public static void main(String[] args) {
        Human pedro = new Human();
        pedro.born();
        pedro.eat();
        pedro.grow(3);
        pedro.fly();
        pedro.respawn();
        pedro.walk();
        pedro.sing();
        pedro.die();
        pedro.changeDimensionChange();

        System.out.println('\n');
        EarthAnimal cat = new EarthAnimal();
        cat.born();
        cat.walk();

        System.out.println('\n');
        SkyAnimal loro = new SkyAnimal();
        loro.born();
        loro.die();
        loro.sing();



    }
}