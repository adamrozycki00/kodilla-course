package com.kodilla.patterns.singleton;

public class Logger {

    private static Logger INSTANCE;

    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if (INSTANCE == null)
            synchronized (Logger.class) {
                if (INSTANCE == null)
                    INSTANCE = new Logger();
            }
        return INSTANCE;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }

}
