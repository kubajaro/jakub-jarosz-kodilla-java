package com.kodilla.stream;

import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor ex = new ExpressionExecutor();

        ex.executeExpression(2,3, (a,b) -> a + b);
        ex.executeExpression(4,4, (a, b) -> a * b);
        ex.executeExpression(5, 2, (a, b) -> a - b);
        ex.executeExpression(4, 2, (a, b) -> a / b);

        System.out.println("----Method references");
        ex.executeExpression(2,3, FunctionalCalculator::addAToB);
        ex.executeExpression(4,4, FunctionalCalculator::multiplyAByB);
        ex.executeExpression(5, 2, FunctionalCalculator::subBFromA);
        ex.executeExpression(4,2, FunctionalCalculator::divideAByB);
    }
}
