package threads;

import java.util.concurrent.*;

public class MyConnectionPool {
    private static final int POOL_SIZE = 5;
    private final BlockingQueue<Connection> pool;
    private static MyConnectionPool instance;

    private MyConnectionPool() {
        pool = new LinkedBlockingQueue<>(POOL_SIZE);
        initializePool();
    }

    public static MyConnectionPool getInstance() {
        if (instance == null) {
            synchronized (MyConnectionPool.class) {
                if (instance == null) {
                    instance = new MyConnectionPool();
                }
            }
        }
        return instance;
    }

    private void initializePool() {
        for (int i = 0; i < POOL_SIZE; i++) {
            Connection connection = new Connection(); // Create or get connection
            pool.offer(connection);
        }
    }

    public Connection getConnection() throws InterruptedException {
        return pool.take();
    }

    public void releaseConnection(Connection connection) {
        pool.offer(connection);
    }
}
