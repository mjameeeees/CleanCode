package BuilderPattern;

import BuilderPattern.ConcreteBuilders.CabinBuilder;
import BuilderPattern.ConcreteBuilders.PalaceBuilder;
import BuilderPattern.Director.Director;
import BuilderPattern.Product.House;


public class Client {
    public static void main(String[] args) {
        Director director = new Director(new CabinBuilder());     
        House house = director.constructHouse();

        System.out.println(house);

        director.changeBuilder(new PalaceBuilder());
        House house2 = director.constructHouse();
        System.out.println(house2.toString());
    }
}
