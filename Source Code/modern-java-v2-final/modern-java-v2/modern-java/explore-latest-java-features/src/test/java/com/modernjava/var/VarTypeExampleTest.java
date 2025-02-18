package com.modernjava.var;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VarTypeExampleTest {

    @Test
    void transform() {

        var result= VarTypeExample.transform("java");
        assertEquals(result, "JAVA");
    }
}