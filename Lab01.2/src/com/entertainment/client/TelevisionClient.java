package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class TelevisionClient {
    public static void main(String[] args) {


        // examine == and the equals() method
        Television tvA = new Television("SONY", 50);
        Television tvB = new Television("SONY", 50);
        Television tvC = new Television("Samsung", 32);
        Television tvD = new Television("LG", 12);

        System.out.println(tvA.hashCode()); // 54
        System.out.println(tvB.hashCode()); // 54
        System.out.println();

        System.out.println("tvA == tvB: " + (tvA == tvB)); // false (of course)
        System.out.println("tvA.equals(tvB): " + (tvA.equals(tvB))); // ??
        System.out.println();

        Set<Television> tvs = new TreeSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        tvs.add(tvC);
        tvs.add(tvD);
        System.out.println("The size of the Set is: " + tvs.size());
        System.out.println();
        for (Television tv : tvs) {
            System.out.println(tv);
        }
    }
}