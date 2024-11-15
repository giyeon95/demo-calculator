package org.example.demo.operation.dbl;


import org.example.demo.Operation;

public class DoubleDevideOperation implements Operation<Double> {

    @Override
    public Double operate(Double num1, Double num2) {
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
