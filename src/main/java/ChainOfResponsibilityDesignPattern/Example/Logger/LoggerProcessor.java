package ChainOfResponsibilityDesignPattern.Example.Logger;

public abstract class LoggerProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LoggerProcessor nextLoggerProcessor;

    public LoggerProcessor(LoggerProcessor loggerProcessor) {
        nextLoggerProcessor = loggerProcessor;
    }

    public void log(int logLevel,String message){
        if(nextLoggerProcessor!=null){
            nextLoggerProcessor.log(logLevel,message);
        }
    }
    //    public void nextLogger(LoggerProcessor loggerProcessor);
//
//    public void printLogs(String type,String message);

}
