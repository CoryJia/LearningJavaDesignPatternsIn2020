package creatationalpattern.ch05fatorymethod.logger;

/**
 * @author : Cory Jia on 11/24/19
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("Write log into database!");
    }
}
