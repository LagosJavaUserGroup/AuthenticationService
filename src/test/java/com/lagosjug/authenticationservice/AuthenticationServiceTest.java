package com.lagosjug.authenticationservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthenticationServiceTest {

    private static final int FIRST = 31;
    private static final int SECOND = 73;
    private static final int THIRD = 42;

    /**
     * Sample Test.
     */
    @Test
    public void sampleTest() {
        Assertions.assertEquals(FIRST, SECOND - THIRD);
    }
}
