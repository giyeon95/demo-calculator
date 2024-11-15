package org.example.demo.operation.number;


import org.example.demo.Operation;

public class DevideOperation implements Operation<Number> {

    @Override
    public Number operate(Number num1, Number num2) {
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
