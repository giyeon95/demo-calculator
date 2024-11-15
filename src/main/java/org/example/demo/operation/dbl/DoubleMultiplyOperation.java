package org.example.demo.operation.dbl;


import org.example.demo.Operation;

public class DoubleMultiplyOperation implements Operation<Double> {

    @Override
    public Double operate(Double num1, Double num2) {
        return num1 + num2;
    }

}
