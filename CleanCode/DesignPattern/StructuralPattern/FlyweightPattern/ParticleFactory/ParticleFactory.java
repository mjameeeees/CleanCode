package StructuralPattern.FlyweightPattern.ParticleFactory;

import java.util.HashMap;
import java.util.Map;

import StructuralPattern.FlyweightPattern.Flyweight.ParticleType;

public class ParticleFactory {
    private static final Map<String, ParticleType> particleTypes = new HashMap<>();

        public static ParticleType getParticleType(String name, String color, String sprite) {
        String key = name + "-" + color + "-" + sprite;
        if (!particleTypes.containsKey(key)) {
            particleTypes.put(key, new ParticleType(name, color, sprite));
        }
        return particleTypes.get(key);
    }
}
