package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJavaTest {

    @Test
    public void testGreet() {
        assertEquals("Hello", HelloKotlinKt.greet());
    }

    @Test
    public void testGreetWithName() {
        assertEquals("Hello, World", HelloKotlinKt.greetWithName());
        assertEquals("Hello, Alice", HelloKotlinKt.greetWithName("Alice"));
    }

    @Test
    public void testAddExclamation() {
        assertEquals("Hello!", HelloKotlinKt.addExclamation("Hello"));
    }
}
