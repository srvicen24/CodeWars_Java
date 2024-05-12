package es.srvicen24.six_kyu.break_camel_case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    public void tests() {
        assertEquals("camel Casing", Solution.camelCase("camelCasing"));
        assertEquals("camel Casing Test", Solution.camelCase("camelCasingTest"));
        assertEquals("camelcasingtest", Solution.camelCase("camelcasingtest"));
    }

}
