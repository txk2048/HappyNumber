package org.txk64;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class HappyNumberTest {
    @Test
    public void happyNumber() {
        assertTrue(HappyNumber.isHappy(1));
        assertTrue(HappyNumber.isHappy(7));
        assertTrue(HappyNumber.isHappy(10));
    }

    @Test
    public void unhappyNumber() {
        assertFalse(HappyNumber.isHappy(2));
        assertFalse(HappyNumber.isHappy(3));
        assertFalse(HappyNumber.isHappy(5));
    }
}
