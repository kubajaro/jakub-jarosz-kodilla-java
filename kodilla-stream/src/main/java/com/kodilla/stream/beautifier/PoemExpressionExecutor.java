package com.kodilla.stream.beautifier;

public class PoemExpressionExecutor {
    public void executor (String text, PoemDecorator poemDecorator){
        System.out.println(poemDecorator.decorate(text));
    }
}
