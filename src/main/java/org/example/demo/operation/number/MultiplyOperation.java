package org.example.demo.operation.number;


import org.example.demo.Operation;

public class MultiplyOperation implements Operation<Number> {

    @Override
    public Number operate(Number num1, Number num2) {
        return num1.doubleValue() * num2.doubleValue();
    }
}
