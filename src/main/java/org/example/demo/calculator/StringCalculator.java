package org.example.demo.calculator;

import org.example.demo.Calculator;
import org.example.demo.Operation;

public class StringCalculator implements Calculator<String> {

    // 1. 나중에 String 타입도 처리해야 한다고 보자
    @Override
    public String calculate(String num1, String num2, Operation<String> operation) {

        return operation.operate(num1, num2);
    }
}
