package ChainOfResponsibilityDesignPattern.Example.Logger;

public class ErrorLoggerProcessor extends LoggerProcessor{


    public ErrorLoggerProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LoggerType.ERROR.value){
            System.out.println("ERROR Log Processor "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
