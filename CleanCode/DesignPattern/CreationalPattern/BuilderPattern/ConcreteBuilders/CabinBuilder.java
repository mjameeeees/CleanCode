package BuilderPattern.ConcreteBuilders;

import BuilderPattern.BuilderInterface.HouseBuilder;
import BuilderPattern.Product.House;

public class CabinBuilder implements HouseBuilder {
    House house = new House();
    @Override
    public void buildWalls() {
        house.setWalls("Wooden Walls");
    }
    @Override
    public void buildRoof() {
        house.setRoof("Wooden Roof");
    }
    @Override
    public void buildDoors() {
        house.setDoors("Wooden Doors");
    }
    @Override
    public void buildWindows() {
        house.setWindows("Glass Windows");
    }
    @Override
    public void buildGarage() {
        house.setGarage(false);
    }
    @Override
    public void buildSwimmingPool() {
        house.setSwimmingPool(false);
    }
    @Override
    public void buildGarden() {
        house.setGarage(false);
    }
    
    public House getHouse() {
        return house;
    }
}
