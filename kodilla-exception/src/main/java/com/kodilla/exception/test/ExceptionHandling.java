package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge sc = new SecondChallenge();
        String result = "Undone";

        try {
            result = sc.probablyIWillThrowException(1.5, 2.5);
        } catch (Exception e) {
            System.out.println("Wrong walues: " + e);
        } finally {
            System.out.println("Result " + result);
        }
    }
}
