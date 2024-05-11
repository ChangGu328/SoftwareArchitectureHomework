package org.example;

import cn.xmu.changgu.Multiton;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultitonTest {

    @Test
    public void testUniqueInstancePerKey() {
        // 获取两次相同键的实例
        Multiton instance1 = Multiton.getInstance("key1");
        Multiton instance2 = Multiton.getInstance("key1");

        // 测试这两个实例是否相同
        assertSame("Instances with the same key should be the same", instance1, instance2);
    }

    @Test
    public void testDifferentInstancesForDifferentKeys() {
        // 获取两次不同键的实例
        Multiton instance1 = Multiton.getInstance("key1");
        Multiton instance2 = Multiton.getInstance("key2");

        // 测试这两个实例是否不同
        assertNotSame("Instances with different keys should be different", instance1, instance2);
    }

    @Test
    public void testInstanceNotNull() {
        // 获取一个实例
        Multiton instance = Multiton.getInstance("key1");

        // 测试实例是否不为null
        assertNotNull("Instance should not be null", instance);
    }

    @Test
    public void testConcurrentAccess() {
        final String key = "key3";
        Thread[] threads = new Thread[100];
        Multiton[] instances = new Multiton[100];

        // 启动100个线程，每个线程获取相同键的实例
        for (int i = 0; i < threads.length; i++) {
            final int index = i;
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    instances[index] = Multiton.getInstance(key);
                }
            });
            threads[i].start();
        }

        // 等待所有线程完成
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // 检查所有线程获取的实例是否相同
        for (int i = 1; i < instances.length; i++) {
            assertSame("All instances should be the same", instances[0], instances[i]);
        }
    }
}
