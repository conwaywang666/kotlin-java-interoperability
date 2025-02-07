# Kotlin and Java Interoperability Project

This project demonstrates how to call Kotlin functions from Java. It includes examples of calling functions with default parameters and extension functions.

## Project Setup

1. Ensure you have JDK 21 and Gradle 8.5 installed.
2. Clone the repository.
3. Open the project in your preferred IDE.

## Kotlin Functions

The Kotlin file `HelloKotlin.kt` includes the following functions:

- `fun greet(): String` - Returns a simple greeting message.
- `fun greetWithName(name: String = "World"): String` - Returns a greeting message with the provided name. If no name is provided, it defaults to "World".
- `fun String.addExclamation(): String` - An extension function that adds an exclamation mark to the string.

## Calling Kotlin Functions from Java

The Java file `HelloJava.java` demonstrates how to call the Kotlin functions:

```java
package com.example;

public class HelloJava {
    public static void main(String[] args) {
        // Call Kotlin functions
        System.out.println(HelloKotlinKt.greet());
        System.out.println(HelloKotlinKt.greetWithName());
        System.out.println(HelloKotlinKt.greetWithName("Alice"));

        // Call Kotlin extension function
        String message = "Hello";
        System.out.println(HelloKotlinKt.addExclamation(message));
    }
}
```

## Running the Project

To run the project, use the following command:

```sh
./gradlew run
```

## Running Tests

To run the tests, use the following command:

```sh
./gradlew test
```

The tests are located in the `src/test/kotlin` and `src/test/java` directories and cover both Kotlin and Java code.

## Conclusion

This project provides a basic example of Kotlin and Java interoperability, including calling functions with default parameters and extension functions. It also includes unit tests to ensure the functions work correctly.
