package com.github.lukassup.tools

import kotlin.test.assertEquals
import org.junit.Test

class TestMain {
    @Test fun testMakeGreetingWithDefaultSubject() {
        assertEquals("Hello, World!", makeGreeting())
    }
    @Test fun testMakeGreetingWithCustomSubject() {
        assertEquals("Hello, Tester!", makeGreeting("Tester"))
    }
}
