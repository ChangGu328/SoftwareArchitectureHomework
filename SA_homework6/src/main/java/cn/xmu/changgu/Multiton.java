package cn.xmu.changgu;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Multiton {

    // 存储实例的哈希表
    private static final Map<String, Multiton> instances = new ConcurrentHashMap<>();

    // 私有构造函数，防止外部直接创建实例
    private Multiton() {
    }

    // 获取实例的方法，使用synchronized保证线程安全
    public static synchronized Multiton getInstance(String key) {
        // 检查实例是否已经存在于哈希表中
        if (!instances.containsKey(key)) {
            // 如果不存在，创建新的实例并放入哈希表
            instances.put(key, new Multiton());
        }
        // 返回对应键的实例
        return instances.get(key);
    }

}
