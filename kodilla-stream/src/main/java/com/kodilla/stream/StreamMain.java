package com.kodilla.stream;

import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("Execute");
        processor.execute(codeToExecute);
    }
}
