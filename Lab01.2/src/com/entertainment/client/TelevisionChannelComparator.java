package com.entertainment.client;

import com.entertainment.Television;

import java.util.Comparator;

class TelevisionChannelComparator implements Comparator<Television> {
    @Override
    public int compare(Television tv1, Television tv2) {
        return Integer.compare(tv1.getCurrentChannel(), tv2.getCurrentChannel());
    }
}