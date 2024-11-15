package org.example.demo.operation.itr;


import org.example.demo.Operation;

public class IntegerDevideOperation implements Operation<Integer> {

    @Override
    public Integer operate(Integer num1, Integer num2) {
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
