package wang.lvshang.blog;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class FaTest {

    @Test
    void testFact() {
        assertEquals(1, Fa.fact(1));
        assertEquals(2, Fa.fact(2));
        assertEquals(6, Fa.fact(3));
        assertEquals(3628800, Fa.fact(10));
        assertEquals(2432902008176640000L, Fa.fact(20));
    }
}
