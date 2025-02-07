package com.example;

public class HelloJava {
    public static void main(String[] args) {
        // Call Kotlin functions
        System.out.println(HelloKotlinKt.greet());
        System.out.println(HelloKotlinKt.greetWithName("null"));
        System.out.println(HelloKotlinKt.greetWithName("Alice"));

        // Call Kotlin extension function
        String message = "Hello";
        System.out.println(HelloKotlinKt.addExclamation(message));
    }
}
