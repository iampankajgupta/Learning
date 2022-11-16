package ChainOfResponsibilityDesignPattern.Example;

public class DivideNumber implements Chain{

    private Chain nextChain;

    @Override
    public void nextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalcWanted().equals("div")){
            System.out.println(request.getNumber1() + " / "+request.getNumber2() + " = "+(request.getNumber1()/request.getNumber2()));
        }else{
            System.out.println("No other operator can handle your request");
        }
    }
}
