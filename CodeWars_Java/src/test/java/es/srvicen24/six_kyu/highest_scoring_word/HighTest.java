package es.srvicen24.six_kyu.highest_scoring_word;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HighTest {
    @Test
    void sampleTests() {
        assertEquals("taxi", High.high("man i need a taxi up to ubud"));
        assertEquals("volcano", High.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", High.high("take me to semynak"));
    }

    @Test
    void edgeCaseTests() {
        assertEquals("aa", High.high("aa b"));
        assertEquals("b", High.high("b aa"));
        assertEquals("bb", High.high("bb d"));
        assertEquals("d", High.high("d bb"));
        assertEquals("aaa", High.high("aaa b"));
    }
}
