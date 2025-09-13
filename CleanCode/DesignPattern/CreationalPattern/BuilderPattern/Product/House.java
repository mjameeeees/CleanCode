package BuilderPattern.Product;

public class House {
        private String walls;
    private String roof;
    private String doors;   
    private String windows;
    private boolean garage;
    private boolean swimmingPool;
    private boolean garden;

    public String setWalls(String walls) {
        return this.walls = walls;
    }

    public String setRoof(String roof) {
        return this.roof = roof;
    }
    public String setDoors(String doors) {
        return this.doors = doors;
    }
    public String setWindows(String windows) {
        return this.windows = windows;
    }

    public boolean setGarage(boolean garage) {
        return this.garage = garage;
    }

    public boolean setSwimmingPool(boolean swimmingPool) {
        return this.swimmingPool = swimmingPool;
    }

    @Override
    public String toString() {
        return "HouseBuilder{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                ", garage=" + garage +
                ", swimmingPool=" + swimmingPool +
                ", garden=" + garden +
                '}';
    }
    
}
