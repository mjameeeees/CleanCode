package BuilderPattern.Director;

import BuilderPattern.BuilderInterface.HouseBuilder;
import BuilderPattern.Product.House;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void changeBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildDoors();
        houseBuilder.buildWindows();
        houseBuilder.buildGarage();
        houseBuilder.buildSwimmingPool();
        houseBuilder.buildGarden();
        houseBuilder.toString();
        return ((houseBuilder instanceof BuilderPattern.ConcreteBuilders.CabinBuilder) ? ((BuilderPattern.ConcreteBuilders.CabinBuilder) houseBuilder).getHouse() : ((BuilderPattern.ConcreteBuilders.PalaceBuilder) houseBuilder).getHouse());
    }
}
