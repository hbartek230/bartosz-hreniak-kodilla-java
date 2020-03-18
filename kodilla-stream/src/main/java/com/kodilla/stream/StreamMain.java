package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        String textToTest = "Bartek";
        PoemBeautifier pb = new PoemBeautifier();
        pb.beautify(textToTest, (decoration -> "Jestem " + textToTest));
        pb.beautify(textToTest, (decoration -> textToTest + " Hreniak"));
        pb.beautify(textToTest, (decoration -> textToTest.toUpperCase()));
        pb.beautify(textToTest, (decoration -> textToTest.toUpperCase().toLowerCase()));
        pb.beautify(textToTest, (decoration -> "---" + textToTest));
        pb.beautify(textToTest, (decoration -> textToTest + "---"));
        pb.beautify(textToTest, (decoration -> "---" + textToTest + "---"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
