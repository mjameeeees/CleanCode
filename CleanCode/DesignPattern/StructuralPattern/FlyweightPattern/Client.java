package StructuralPattern.FlyweightPattern;

import StructuralPattern.FlyweightPattern.GameWorld.GameWorld;

public class Client {
    public static void main(String[] args) {
        GameWorld world = new GameWorld();
        world.spawnParticles();
        world.render();
    
    }
}
