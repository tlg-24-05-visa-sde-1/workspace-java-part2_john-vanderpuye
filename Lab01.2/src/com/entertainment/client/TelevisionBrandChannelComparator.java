package com.entertainment.client;

import com.entertainment.Television;

import java.util.Comparator;

class TelevisionBrandChannelComparator implements Comparator<Television> {
    @Override
    public int compare(Television tv1, Television tv2) {
        int brandComparison = tv1.getBrand().compareTo(tv2.getBrand());
        if (brandComparison != 0) {
            return brandComparison;
        }
        return Integer.compare(tv1.getCurrentChannel(), tv2.getCurrentChannel());
    }
}