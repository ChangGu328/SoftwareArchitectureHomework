package org.example;

import cn.xmu.changgu.Singleton;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    void testSingletonInstanceUniqueness() throws InterruptedException {
        // 使用HashSet存储从多个线程获取的Singleton实例的哈希码
        Set<Integer> instanceHashCodes = new HashSet<>();
        // 创建一个固定大小的线程池，用于并发获取Singleton实例
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // 提交100个任务到线程池，每个任务都会获取Singleton实例并将其哈希码添加到集合中
        for (int i = 0; i < 100; i++) {
            executor.execute(() -> {
                Singleton instance = Singleton.getInstance();
                // 同步块确保在添加哈希码时不会发生线程冲突
                synchronized (instanceHashCodes) {
                    instanceHashCodes.add(System.identityHashCode(instance));
                }
            });
        }

        //关闭线程池
        executor.shutdown();
        // 等待已提交的任务完成执行，最长等待1秒
        executor.awaitTermination(1, TimeUnit.SECONDS);

        // 断言确保所有线程获得的是同一个Singleton实例
        assertEquals(1, instanceHashCodes.size(), "Multiple instances are created in a singleton pattern");
    }
}
