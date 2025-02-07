package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class HelloKotlinTest {

    @Test
    fun testGreet() {
        assertEquals("Hello", greet())
    }

    @Test
    fun testGreetWithName() {
        assertEquals("Hello, World", greetWithName())
        assertEquals("Hello, Alice", greetWithName("Alice"))
    }

    @Test
    fun testAddExclamation() {
        assertEquals("Hello!", "Hello".addExclamation())
    }
}
