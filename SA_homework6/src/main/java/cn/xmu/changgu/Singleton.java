package cn.xmu.changgu;

public class Singleton {
    // 使用volatile关键字确保多线程环境下的可见性和禁止指令重排序
    private static volatile Singleton instance;

    // 私有构造函数，防止外部通过new创建多个实例
    private Singleton() {
    }

    // 提供一个公共的静态方法来获取实例，同时使用双重检查锁定来确保线程安全
    public static Singleton getInstance() {
        // 第一次检查：如果实例已经创建，直接返回已有的实例，避免不必要的同步开销
        if (instance == null) {
            // 同步块，确保线程安全
            synchronized (Singleton.class) {
                // 第二次检查：确保实例未被其他线程初始化
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
