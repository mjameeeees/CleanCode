package BuilderPattern.ConcreteBuilders;

import BuilderPattern.BuilderInterface.HouseBuilder;
import BuilderPattern.Product.House;

public class PalaceBuilder implements HouseBuilder {
    House house = new House();
    @Override
    public void buildWalls() {
        house.setWalls("Finish Walls");
    }  
    
    @Override
    public void buildRoof() {
        house.setRoof("Bricks Roof");
    }  
    
    @Override
    public void buildDoors() {
        house.setDoors("Glass Doors");
    }

    @Override
    public void buildWindows() {
        house.setWindows("Sliding Windows");
    }   

    @Override
    public void buildGarage() {
        house.setGarage(true);
    }

    @Override
    public void buildSwimmingPool() {
        house.setSwimmingPool(true);
    }

    @Override
    public void buildGarden() {
        house.setGarage(true);
    }

    public House getHouse() {
        return house;
    }
}
