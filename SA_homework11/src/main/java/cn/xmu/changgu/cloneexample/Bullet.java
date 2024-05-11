package cn.xmu.changgu.cloneexample;

import cn.xmu.changgu.cloneexample.framework.GameEntity;

public class Bullet implements GameEntity {
    private int speed;
    private int damage;

    public Bullet(int speed, int damage) {
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public Bullet clone() {
        try {
            return (Bullet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Getters 和 Setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
