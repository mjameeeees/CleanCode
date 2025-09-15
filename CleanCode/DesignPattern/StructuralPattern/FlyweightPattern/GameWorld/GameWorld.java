package StructuralPattern.FlyweightPattern.GameWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import StructuralPattern.FlyweightPattern.Flyweight.ParticleType;
import StructuralPattern.FlyweightPattern.Particle.Particle;
import StructuralPattern.FlyweightPattern.ParticleFactory.ParticleFactory;

public class GameWorld {
    private List<Particle> particles = new ArrayList<>();

    public void spawnParticles() {
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            int speed = random.nextInt(10) + 1;
            int direction = random.nextInt(360);

            // Use the same particle type for all bullets
            ParticleType bulletType = ParticleFactory.getParticleType("Bullet", "Yellow", "bullet.png");
            particles.add(new Particle(x, y, speed, direction, bulletType));
        }

        // You can also create missiles, explosions, etc.
        for (int i = 0; i < 500; i++) {
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            int speed = random.nextInt(5) + 1;
            int direction = random.nextInt(360);

            ParticleType missileType = ParticleFactory.getParticleType("Missile", "Red", "missile.png");
            particles.add(new Particle(x, y, speed, direction, missileType));
        }
    }

    public void render() {
        for (Particle p : particles) {
            p.render();
        }
    }
}
