package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {


        // examine == and the equals() method
        Television tvA = new Television("SONY", 50);
        Television tvB = new Television("SONY", 50);

        System.out.println(tvA.hashCode()); // 54
        System.out.println(tvB.hashCode()); // 54
        System.out.println();

        System.out.println("tvA == tvB: " + (tvA == tvB)); // false (of course)
        System.out.println("tvA.equals(tvB): " + (tvA.equals(tvB))); // ??
        System.out.println();

        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        System.out.println("The size of the Set is: " + tvs.size());
    }
}