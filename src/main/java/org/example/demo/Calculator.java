package org.example.demo;


public interface Calculator<T> {

    T calculate(T num1, T num2, Operation<T> operation);
}
