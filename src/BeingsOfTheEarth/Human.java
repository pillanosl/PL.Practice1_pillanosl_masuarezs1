package BeingsOfTheEarth;
import CreatorPackage.LivingBeings;
import SkyBeings.SkyBeing;

public class Human extends LivingBeings implements EarthBeing, SkyBeing {
    @Override
    public void born() {
        System.out.println("Hello world, I'm human");
    }
    @Override
    public void grow(int years) {
        System.out.println("I grew up" +years+" years");

    }

    @Override
    public void eat() {
        System.out.println("Eating soup ñam, ñam");

    }

    @Override
    public void respawn() {
        System.out.println("I gave birth to ... children");
    }

    @Override
    public void die() {
        System.out.println("I passed away");
    }

    @Override
    public void walk() {
        System.out.println("Caminando humano");
    }

    @Override
    public void fly() {
        System.out.println("volando en avion");
    }

    @Override
    public void changeDimensionChange() {
        System.out.println("cambiando a un lugae¿r mejor (soy fantasma) ");
    }

    @Override
    public void sing() {
        System.out.println("Canto vallenato");

    }

}
