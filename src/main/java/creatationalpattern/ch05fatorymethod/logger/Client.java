package creatationalpattern.ch05fatorymethod.logger;

/**
 * @author : Cory Jia on 11/24/19
 */
public class Client {
    public static void main(String[] args) {
       /* LoggerFactory factory;
        Logger logger;
        factory = new DatabaseLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();*/

       LoggerFactory factory;
       Logger logger;

        factory = (LoggerFactory) XMLUtil.getBean(0);
        logger = factory.createLogger();
        logger.writeLog();
    }
}
