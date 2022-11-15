package ChainOfResponsibilityDesignPattern.Example;

public class SubtractNumber implements Chain{

    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted().equals("subtract")){
            System.out.println(request.getNumber1() + " - "+request.getNumber2() + " = "+(request.getNumber1()-request.getNumber2()));
        }else{
            nextChain.calculate(request);
        }
    }
}
