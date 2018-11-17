package com.jockey.tool.learning.async;

import java.util.concurrent.*;

/**
 * @author robberte
 * @date 2018/10/10 下午11:54
 */
public class ThreadPoolTest {

    public static ThreadPoolExecutor executors = new ThreadPoolExecutor(2, 10,
            60 * 1000L, TimeUnit.MILLISECONDS,
            new ArrayBlockingQueue<>(1000), new ThreadFactory() {

        @Override
        public Thread newThread(Runnable r) {
            return null;
        }
    }, new RejectedExecutionHandler() {
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println(String.format("Rejected Execution:ThreadName=%s", Thread.currentThread().getName()));
            r.run();
        }
    });

    

}
