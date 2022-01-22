package com.kodilla.stream;

import com.kodilla.stream.beautifier.BeautifierServices;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemExpressionExecutor;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;

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

        System.out.println("------- task 7.1");

        PoemExpressionExecutor poemExpressionExecutor = new PoemExpressionExecutor();
        String textToBeautify = "Text To Beautify";

        poemExpressionExecutor.executor(textToBeautify, (text) -> text.toLowerCase());
        poemExpressionExecutor.executor(textToBeautify, (text) -> text.toUpperCase());
        poemExpressionExecutor.executor(textToBeautify, (text) -> text + " (after text)");
        poemExpressionExecutor.executor(textToBeautify, BeautifierServices::firstAndLastLetterUpperCase);
        poemExpressionExecutor.executor(textToBeautify, BeautifierServices::textAsQuote);
    }
}
