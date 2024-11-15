package org.example.demo.operation.positive;

import org.example.demo.Operation;

public class PositiveAddOperation implements Operation<Number> {

    @Override
    public Number operate(Number num1, Number num2) {
        if (num1.doubleValue() < 0 || num2.doubleValue() < 0) {
            throw new IllegalArgumentException("input only positive number");
        }

        return num1.doubleValue() + num2.doubleValue();
    }
}
