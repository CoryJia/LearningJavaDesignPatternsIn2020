package creatationalpattern.ch05fatorymethod.logger;

/**
 * @author : Cory Jia on 11/24/19
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //create connection to file system
        Logger logger = new FileLogger();
        //create a file
        return logger;
    }
}
