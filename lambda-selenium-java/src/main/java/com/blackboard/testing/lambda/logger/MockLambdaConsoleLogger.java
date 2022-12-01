package com.blackboard.testing.lambda.logger;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

import java.util.Arrays;

public class MockLambdaConsoleLogger implements LambdaLogger {

    @Override
    public void log(String string) {
        System.out.println(string);
    }

    @Override
    public void log(byte[] message) {
        System.out.println(Arrays.toString(message));
    }
}
