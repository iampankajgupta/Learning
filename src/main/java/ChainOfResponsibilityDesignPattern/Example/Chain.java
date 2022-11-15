package ChainOfResponsibilityDesignPattern.Example;

public interface Chain {
    public void nextChain(Chain nextChain);

    public void calculate(Numbers request);

}
