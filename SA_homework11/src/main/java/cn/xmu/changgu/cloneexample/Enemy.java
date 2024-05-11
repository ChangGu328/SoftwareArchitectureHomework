package cn.xmu.changgu.cloneexample;

import cn.xmu.changgu.cloneexample.framework.GameEntity;

public class Enemy implements GameEntity {
    private String type;
    private int health;

    public Enemy(String type, int health) {
        this.type = type;
        this.health = health;
    }

    @Override
    public Enemy clone() {
        try {
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException e) {
            // 这种情况不应该发生，因为我们的类实现了 Cloneable 接口
            throw new AssertionError();
        }
    }

    // Getters 和 Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
