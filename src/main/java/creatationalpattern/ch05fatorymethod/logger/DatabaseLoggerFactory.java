package creatationalpattern.ch05fatorymethod.logger;

/**
 * @author : Cory Jia on 11/24/19
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //connect database
        Logger logger = new DatabaseLogger();
        //initialize logger
        return logger;
    }
}
