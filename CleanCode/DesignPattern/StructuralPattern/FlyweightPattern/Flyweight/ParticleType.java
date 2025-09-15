package StructuralPattern.FlyweightPattern.Flyweight;

public class ParticleType {
    private String name;
    private String color;
    private String sprite;

    public ParticleType(String name, String color, String sprite){
        this.name = name;
        this.color = color;
        this.sprite = sprite;
    }

    public void render(int x, int y, int speed, int direction) {
        System.out.printf("Rendering %s at (%d, %d) with speed %d and direction %d\n", name, x, y, speed, direction);
    }
}
