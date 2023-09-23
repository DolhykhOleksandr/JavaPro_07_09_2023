package ua.hillel.dolhykh.homeworks.homework8.variant2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileLogger {

    public static void setUpLogger(FileLoggerConfiguration config) {
        FileLoggerConfiguration FileLoggerConfiguration = config;
    }

    static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMMM/yyyy", new Locale("uk", "UA"));
    static String date = dateFormat.format(new Date());

    private static Object locale = new Locale("uk", "UA");
    static DateFormat dateFormate = DateFormat.getTimeInstance(DateFormat.DEFAULT, (Locale) locale);
    static String time = dateFormate.format(new Date());

    static String DEBUG = "lOG TEXT";
    static String INFO = "DFJDDFJDFGJ";

    public static String debug(String text) throws Exception {
        String a = FileLoggerConfiguration.writeFile("|||||||DEBUG|||||||\n|||data|||      |||time||| |level| |||message|||\n" + date + " || " + time
                + " | " + FileLoggerConfiguration.getLevel() + " | " + DEBUG + "\n" + info(INFO));
        return a;
    }

    public static String info(String text) throws Exception {
        String a = FileLoggerConfiguration.writeFile("|||||||INFO|||||||\n|||data|||      |||time||| |level| |||message|||\n" + date + " || " + time
                + " | " + FileLoggerConfiguration.getLevel() + " | " + INFO);
        return a;
    }
}