package org.example.demo.operation;

import org.example.demo.Operation;

public class StringAddOperation implements Operation<String> {

    @Override
    public String operate(String str1, String str2) {
        return str1 + str2;
    }
}
