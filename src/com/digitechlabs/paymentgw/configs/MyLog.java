package com.digitechlabs.paymentgw.configs;

import org.apache.log4j.*;

public class MyLog {

    String logPath;
    private static Logger logger = null;

//    public MyLog(String logFile) {
//        this.logPath = logFile;
//        PropertyConfigurator.configure(logPath);
//        logger = Logger.getRootLogger();
//    }
    public static void Debug(String logString) {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        String clsName = ste.getClassName();
        clsName = clsName.substring(clsName.lastIndexOf(".") + 1, clsName.length());
        if (clsName.isEmpty()) {
            return;
        }
        //get a proper instance
        Logger subLog = Logger.getLogger(clsName);
        if (subLog == null) {
            return;
        }
        subLog.log(Level.DEBUG, " (" + ste.getFileName() + "," + ste.getLineNumber() + "," + ste.getMethodName() + ") " + logString);
    }

    public static void Infor(String logString) {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        String clsName = ste.getClassName();
        clsName = clsName.substring(clsName.lastIndexOf(".") + 1, clsName.length());
        if (clsName.isEmpty()) {
            return;
        }
        //get a proper instance
        Logger subLog = Logger.getLogger(clsName);
        if (subLog == null) {
            return;
        }
        subLog.log(Level.INFO, " (" + ste.getFileName() + "," + ste.getLineNumber() + "," + ste.getMethodName() + ") " + logString);
    }

    public static void Error(String logString) {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        String clsName = ste.getClassName();
        clsName = clsName.substring(clsName.lastIndexOf(".") + 1, clsName.length());
        if (clsName.isEmpty()) {
            return;
        }
        //get a proper instance
        Logger subLog = Logger.getLogger(clsName);
        if (subLog == null) {
            return;
        }
        subLog.log(Level.ERROR, " (" + ste.getFileName() + "," + ste.getLineNumber() + "," + ste.getMethodName() + ") " + logString);
    }

    public static void Fatal(String logString) {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        String clsName = ste.getClassName();
        clsName = clsName.substring(clsName.lastIndexOf(".") + 1, clsName.length());
        if (clsName.isEmpty()) {
            return;
        }
        //get a proper instance
        Logger subLog = Logger.getLogger(clsName);
        if (subLog == null) {
            return;
        }
        subLog.log(Level.FATAL, " (" + ste.getFileName() + "," + ste.getLineNumber() + "," + ste.getMethodName() + ") " + logString);
    }

    public static void Warning(String logString) {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        String clsName = ste.getClassName();
        clsName = clsName.substring(clsName.lastIndexOf(".") + 1, clsName.length());
        if (clsName.isEmpty()) {
            return;
        }
        //get a proper instance
        Logger subLog = Logger.getLogger(clsName);
        if (subLog == null) {
            return;
        }
        subLog.log(Level.WARN, " (" + ste.getFileName() + "," + ste.getLineNumber() + "," + ste.getMethodName() + ") " + logString);
    }

    public static void Error(Exception ex) {
        Error(ex.getMessage());
        StackTraceElement e[] = ex.getStackTrace();
        for (int i = 0; i < e.length; i++) {
            Error(e[i].toString());
        }
    }
}