package ChainOfResponsibilityDesignPattern.Example.Logger;

public class Main {
    public static void main(String[] args) {
        LoggerProcessor loggerProcessor = new InforLoggerProcessor(new DebugLoggerProcessor(new ErrorLoggerProcessor(null)));
        loggerProcessor.log(LoggerType.DEBUG.value, "hello");
    }
}
