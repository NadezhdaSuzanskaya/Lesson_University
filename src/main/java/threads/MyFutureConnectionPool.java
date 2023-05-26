package threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;

public class MyFutureConnectionPool {
    private static final int POOL_SIZE = 5;
    private final BlockingQueue<Connection> pool;
    private static MyFutureConnectionPool instance;

    private MyFutureConnectionPool() {
        pool = new LinkedBlockingQueue<>(POOL_SIZE);
        initializePool();
    }

    public static MyFutureConnectionPool getInstance() {
        if (instance == null) {
            synchronized (MyFutureConnectionPool.class) {
                if (instance == null) {
                    instance = new MyFutureConnectionPool();
                }
            }
        }
        return instance;
    }

    private void initializePool() {
        for (int i = 0; i < POOL_SIZE; i++) {
            Connection connection = new Connection(); // Create or acquire connection
            pool.offer(connection);
        }
    }

    public CompletableFuture<Connection> getConnection() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return pool.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public CompletableFuture<Void> releaseConnection(Connection connection) {
        return CompletableFuture.runAsync(() -> pool.offer(connection));
    }
    }

