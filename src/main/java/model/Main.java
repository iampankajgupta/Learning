package model;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calc calc = new Calc();
        System.out.println(calc.calculate(new Addition(2,4)));
        System.out.println(calc.calculate(new Division(10,2)));
    }
}
