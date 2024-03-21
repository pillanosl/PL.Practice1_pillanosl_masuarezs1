package CreatorPackage;

import BeingsOfTheEarth.EarthAnimal;
import BeingsOfTheEarth.Human;
import SkyBeings.SkyAnimal;

public class LivingBeingsCreator implements Creator {
    public LivingBeings createLivingBeings(String species) {
        System.out.println("------... Creating a living being ...--------");
        if ("Human".equals(species)) {
            return new Human("Pedro", "Colombia");
        } else {
            String[] ArrCountries = {"Colombia", "Paraguay", "Brazil", "Mexico", "Australia", "Peru", "Chile"};
            if ("SkyAnimal".equals(species)) {
                String[] ArrSkyBeings = {"Bird", "Parrot", "Macaw", "Butterfly", "Hummingbird", "Eagle", "Dragon"};
                int i1 = (int) (Math.random() * 7);
                String skyType = ArrSkyBeings[i1];
                int i2 = (int) (Math.random() * 7);
                String skyOrigin = ArrCountries[i2];
                return new SkyAnimal(skyType, skyOrigin);
            } else {
                if ("EarthAnimal".equals(species)) {
                    String[] ArrEarthBeings = {"Dog", "Cat", "Horse", "Cow", "Camel", "Kangaroo", "Elephant"};
                    int i3 = (int) (Math.random() * 7);
                    String skyType = ArrEarthBeings[i3];
                    int i4 = (int) (Math.random() * 7);
                    String skyOrigin = ArrCountries[i4];
                    return new EarthAnimal(skyType, skyOrigin);
                }
            }
        }
        return null;
    }

}
