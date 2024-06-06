package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/*
 * BVT:
 *    volume
 *    -1,0 and 100, 101
 *    channel
 *    0,1 and 999,1000
 */
public class TelevisionTest {
    private Television tv1;
    private Television tv2;
    private Television tv3;

    @Before
    public void setUp(){
        tv1 = new Television("Sony", 50, DisplayType.LED);
        tv2 = new Television("Sony", 50, DisplayType.LED);
        tv3 = new Television("LG", 30, DisplayType.LCD);
    }

    @Test
    public void equals_shouldReturnTrue_whenObjectsAreEqual() {
        assertTrue(tv1.equals(tv2));
    }

    @Test
    public void equals_shouldReturnFalse_whenObjectsAreNotEqual() {
        assertFalse(tv1.equals(tv3));
    }

    @Test
    public void hashCode_shouldBeEqual_whenObjectsAreEqual() {
        assertEquals(tv1.hashCode(), tv2.hashCode());
    }

    @Test
    public void hashCode_shouldBeDifferent_whenObjectsAreNotEqual() {
        assertNotEquals(tv1.hashCode(), tv3.hashCode());
    }


    @Test
    public void compareTo_shouldReturnZero_whenBrandsAreEqual() {
        assertEquals(0, tv1.compareTo(tv2));
    }


    @Test
    public void changeChannel_shouldStoreValue_validInput_upperBound() throws InvalidChannelException{
        tv1.changeChannel(999);
        assertEquals(999, tv1.getCurrentChannel());
    }

    @Test
    public void changeChannel_shouldStoreValue_validInput_lowerBound() throws InvalidChannelException {
        tv1.changeChannel(1);
        assertEquals(1, tv1.getCurrentChannel());
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_invalidInput_upperBound() throws InvalidChannelException {
        tv1.changeChannel(1000);
    }

    @Test(expected = InvalidChannelException.class)
    public void changeChannel_shouldThrowInvalidChannelException_invalidInput_lowerBound() throws InvalidChannelException {
        tv1.changeChannel(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_invalidInput_upperBound() {
        tv1.setVolume(101);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setVolume_shouldThrowIllegalArgumentException_invalidInput_lowerBound() {
        tv1.setVolume(-1);
    }

    @Test
    public void setVolume_shouldStoreValue_validInput_lowerBound() {
        tv1.setVolume(0);
        assertEquals(0, tv1.getVolume());
    }

    @Test
    public void setVolume_shouldStoreVolume_validInput_upperBound() {
        tv1.setVolume(100);
        assertEquals(100, tv1.getVolume());
    }
}
