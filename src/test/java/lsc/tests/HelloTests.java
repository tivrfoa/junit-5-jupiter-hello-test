package lsc.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloTests {

        @Test
        @DisplayName("hello.getHello()")
        void getHello() {
            Hello hello = new Hello();
            assertEquals("Hello =)", hello.getHello());
        }
}
