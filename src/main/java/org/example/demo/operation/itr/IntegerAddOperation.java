package org.example.demo.operation.itr;

import org.example.demo.Operation;

public class IntegerAddOperation implements Operation<Integer> {

    @Override
    public Integer operate(Integer num1, Integer num2) {
        return num1 + num2;
    }

}
