package threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewRunnableClass implements Runnable {
    @Override
    public void run() {
        final Logger LOGGER = LogManager.getLogger();
        LOGGER.info("!!!Run a thread!!!");
    }
}
