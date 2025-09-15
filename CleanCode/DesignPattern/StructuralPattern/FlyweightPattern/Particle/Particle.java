package StructuralPattern.FlyweightPattern.Particle;

import StructuralPattern.FlyweightPattern.Flyweight.ParticleType;

public class Particle {
    private int x;
    private int y;
    private int speed;
    private int direction;

    private ParticleType type; // shared flyweight

    public Particle(int x, int y, int speed, int direction, ParticleType type) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
        this.type = type;
    }

    public void render() {
        type.render(x, y, speed, direction); // pass extrinsic data
    }
}
