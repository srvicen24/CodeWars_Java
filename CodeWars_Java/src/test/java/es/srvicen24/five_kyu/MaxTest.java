package es.srvicen24.five_kyu;

import es.srvicen24.five_kyu.maximum_subarray_sum.Max;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTest {

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals(0, Max.sequence(new int[]{}));
    }

    @Test
    public void testExampleArray() throws Exception {
        assertEquals(6, Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
