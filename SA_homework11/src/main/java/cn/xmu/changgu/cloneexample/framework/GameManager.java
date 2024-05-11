package cn.xmu.changgu.cloneexample.framework;

import java.util.HashMap;
import java.util.Map;

public class GameManager {
    private Map<String, GameEntity> prototypes = new HashMap<>();

    public void registerEntity(String name, GameEntity entity) {
        prototypes.put(name, entity);
    }

    public GameEntity create(String name) {
        GameEntity prototype = prototypes.get(name);
        return prototype.clone();
    }
}
