package es.srvicen24.six_kyu.write_a_number_in_expanded_form;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    public void testSomething() {
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("40 + 2", Kata.expandedForm(42));
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
    }

}
