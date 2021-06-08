package org.edu;

//import org.apache.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Hello world!
 */
public class App {
  //  static Logger LOGGER = Logger.getLogger(App.class);


    public static void main(String[] args) {
        Logger LOGGER = LoggerFactory.getLogger("App");

        SuperChecker superChecker = new SuperChecker();
        SimpleExample simpleExample = new SimpleExample();
        try {
            superChecker.checkLevel(0);
        }
        catch (MyCheckException exception){
            StringBuilder message = new StringBuilder();
            for(StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                message.append(System.lineSeparator() + stackTraceElement.toString());
            }
            LOGGER.error(message.toString());
            LOGGER.error(String.valueOf(exception));

        }
        try {
            simpleExample.checkInt(10);
        } catch (RuntimeException r){
            StringBuilder message = new StringBuilder();
            for(StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                message.append(System.lineSeparator() + stackTraceElement.toString());
            }
            LOGGER.error(message.toString());
            LOGGER.error(String.valueOf(r));
        }
    }
}
