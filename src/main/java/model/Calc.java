package model;

import java.io.IOException;
import java.security.InvalidParameterException;

public class Calc {
    public double calculate(calculator operation) throws IOException {
        if(operation==null){
            throw new InvalidParameterException("Cannot perform operation");
        }
        return operation.perform();

    }
}
