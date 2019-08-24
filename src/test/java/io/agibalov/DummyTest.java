package io.agibalov;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DummyTest {
    @Test
    public void dummy() {
        System.out.println("I am test!");
    }

    @Test
    public void failingTest() {
        //assertTrue(false);
    }
}
