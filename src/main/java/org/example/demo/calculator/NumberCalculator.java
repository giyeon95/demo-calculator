package org.example.demo.calculator;

import java.util.ArrayDeque;
import org.example.demo.Calculator;
import org.example.demo.Operation;

public class NumberCalculator implements Calculator<Number> {

    private final ArrayDeque<Number> resultDeque = new ArrayDeque<>();

    @Override
    public Number calculate(Number num1, Number num2, Operation<Number> operation) {
        Number result = operation.operate(num1, num2);
        resultDeque.addLast(result);
        return null;
    }

    public void discardOldest() {
        if (!resultDeque.isEmpty()) {
            resultDeque.pollFirst();
        }
    }

    public void undo() {
        if (!resultDeque.isEmpty()) {
            resultDeque.pollLast();
        }
    }

    public Number[] getHistory() {
        return resultDeque.toArray(Number[]::new);
    }
}
