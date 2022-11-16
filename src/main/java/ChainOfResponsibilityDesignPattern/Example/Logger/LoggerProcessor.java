package ChainOfResponsibilityDesignPattern.Example.Logger;

public abstract class LoggerProcessor {

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
