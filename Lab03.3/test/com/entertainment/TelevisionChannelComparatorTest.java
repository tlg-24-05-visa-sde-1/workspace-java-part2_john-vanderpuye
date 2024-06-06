package com.entertainment;

import org.junit.Before;

import static org.junit.Assert.*;

public class TelevisionChannelComparatorTest {
    // you need 3 things in the fixture
    // tv1
    // tv2
    // a comparator

    // in your assertion, you'll call compare() directly
    // comparator.compare(tv1, tv2)
    private Television tv1;
    private Television tv2;


    @Before
    public void setUp() {
        tv1 = new Television();
        tv2 = new Television();
    }
}