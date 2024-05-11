package cn.xmu.changgu.cloneexample;

import cn.xmu.changgu.cloneexample.framework.GameManager;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        // 注册敌人原型
        Enemy enemyPrototype = new Enemy("zombie", 100);
        gameManager.registerEntity("zombie", enemyPrototype);

        // 注册子弹原型
        Bullet bulletPrototype = new Bullet(300, 50);
        gameManager.registerEntity("standardBullet", bulletPrototype);

        // 克隆敌人
        Enemy clonedEnemy = (Enemy) gameManager.create("zombie");
        System.out.println("Cloned Enemy Type: " + clonedEnemy.getType() + ", Health: " + clonedEnemy.getHealth());

        // 克隆子弹
        Bullet clonedBullet = (Bullet) gameManager.create("standardBullet");
        System.out.println("Cloned Bullet Speed: " + clonedBullet.getSpeed() + ", Damage: " + clonedBullet.getDamage());
    }
}
