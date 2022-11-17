package ChainOfResponsibilityDesignPattern.Example.Logger;

public class InforLoggerProcessor extends LoggerProcessor{

    private LoggerProcessor loggerProcessor;

    public InforLoggerProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == LoggerType.INFO.value){
            System.out.println("Info Log Processor");
        }else{
            super.log(logLevel,message);
        }
    }

}
