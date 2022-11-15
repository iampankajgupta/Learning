package ChainOfResponsibilityDesignPattern.Example;

public class AddNumber implements Chain{

    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted().equals("add")){
            System.out.println(request.getNumber1() + " + "+request.getNumber2() + " = "+(request.getNumber1()+request.getNumber2()));
        }else{
            nextChain.calculate(request);
        }
    }
}
