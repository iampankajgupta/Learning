package ChainOfResponsibilityDesignPattern.Example;

public class MultiplyNumber implements Chain{

    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted().equals("multiply")){
            System.out.println(request.getNumber1() + " * "+request.getNumber2() + " = "+(request.getNumber1()*request.getNumber2()));
        }else{
            nextChain.calculate(request);
        }
    }
}
