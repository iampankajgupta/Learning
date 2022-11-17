package ChainOfResponsibilityDesignPattern.Example.Logger;

public class DebugLoggerProcessor extends LoggerProcessor{

    public DebugLoggerProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel == LoggerType.DEBUG.value){
            System.out.println("Debug Logger "+message);
        }else super.log(logLevel,message);
    }

}
