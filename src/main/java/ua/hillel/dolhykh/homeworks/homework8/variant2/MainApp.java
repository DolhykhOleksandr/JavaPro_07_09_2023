package ua.hillel.dolhykh.homeworks.homework8.variant2;

import static com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl.DEBUG;
import static ua.hillel.dolhykh.homeworks.homework8.variant2.FileLogger.INFO;

public class MainApp {
    private static ua.hillel.dolhykh.homeworks.homework8.variant2.FileLoggerConfiguration FileLoggerConfiguration;

    public static void main(String[] args) throws Exception {
        FileLoggerConfiguration loggerConfig = new FileLoggerConfiguration(LoggingLevel.DEBUG, "C://User...");
        FileLogger.setUpLogger(FileLoggerConfiguration);
        if (loggerConfig.getLevel() == LoggingLevel.DEBUG) {
            ua.hillel.dolhykh.homeworks.homework8.variant2.FileLoggerConfiguration.writeFile(FileLogger.debug(DEBUG));
        } else {
            ua.hillel.dolhykh.homeworks.homework8.variant2.FileLoggerConfiguration.writeFile(FileLogger.info(INFO));
        }
    }
}