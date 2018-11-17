package com.jockey.tool.learning.async;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author robberte
 * @date 2018/10/11 上午12:08
 */
public class NamedThreadFactory implements ThreadFactory {

    private static AtomicInteger globalThreadId = new AtomicInteger(0);
    private AtomicInteger currentThreadId = new AtomicInteger(0);
    private static String DEFAULT_POOL_NAME_PREFIX = "jockey-";
    private String poolNamePrefix = DEFAULT_POOL_NAME_PREFIX;
    private String threadNamePrefix;

    private boolean isDeamon = false;
    private int currentPoolId;


    /**
     * @param threadNamePrefix
     *
     * 创建出来的线程名类似如：jockey-pool-2-threadNamePrefix-3
     */
    public NamedThreadFactory(String threadNamePrefix) {
        this(DEFAULT_POOL_NAME_PREFIX, threadNamePrefix, false);

    }

    public NamedThreadFactory(String threadNamePrefix, boolean isDeamon) {
        this(DEFAULT_POOL_NAME_PREFIX, threadNamePrefix, isDeamon);
    }

    public NamedThreadFactory(String poolNamePrefix, String threadNamePrefix, boolean isDeamon) {
        this.poolNamePrefix = poolNamePrefix;
        this.threadNamePrefix = threadNamePrefix;
        this.currentPoolId = globalThreadId.getAndIncrement();
        this.isDeamon = isDeamon;
    }


    @Override
    public Thread newThread(Runnable r) {
        String threadName = poolNamePrefix + currentPoolId + "-"
                + threadNamePrefix + "-" + currentThreadId.getAndIncrement();
        Thread thread = new Thread(r, threadName);
        thread.setDaemon(this.isDeamon);
        return thread;
    }
}
