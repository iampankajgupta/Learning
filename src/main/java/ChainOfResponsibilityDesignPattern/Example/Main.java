package ChainOfResponsibilityDesignPattern.Example;

public class Main {
    public static void main(String[] args) {
        Chain chain = new AddNumber();
        Chain chain1 = new SubtractNumber();
        Chain chain2 = new MultiplyNumber();
        Chain chain3 = new DivideNumber();

        chain.nextChain(chain1);
        chain1.nextChain(chain2);
        chain2.nextChain(chain3);

        Numbers numbers = new Numbers(1,3,"multiply");
        chain.calculate(numbers);
    }
}
