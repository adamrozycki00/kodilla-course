package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));
        ExpressionExecutor executor = new ExpressionExecutor();
        executor.executeExpression(3, 2, (a, b) -> a * b);
    }

}
