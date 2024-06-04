/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;


import java.util.ArrayList;
import java.util.Collection;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // testFindById();
        // testFindByKeyword();
        // testFindByCategory();
        // testSize();
        // testGetAll();

         testCheapRock();
        // testFindSelfTitled();
        // testGenreCount();
        // testAveragePrice();
    }

    private static void testAveragePrice() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        double average = catalog.averagePrice();
        System.out.println("The average price is: " + average);
    }

    private static void testGenreCount() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        int count = catalog.genreCount(MusicCategory.ALTERNATIVE);

        System.out.println("The number of alternative albums is " + count);
    }

    private static void testFindSelfTitled() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> selfTitle = catalog.findSelfTitled();
        dump(selfTitle);
    }

    private static void testCheapRock() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> cheapItems = catalog.cheapRock(12.0);
        dump(cheapItems);
    }

    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem found = catalog.findById(6L);
        System.out.println(found);
        MusicItem notFound = catalog.findById(101L);
        System.out.println(notFound);
    }

    private static void testFindByKeyword() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> keyItems = catalog.findByKeyword("LI");
        dump(keyItems);
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
        dump(popItems);

        Collection<MusicItem> jazzItems = catalog.findByCategory(MusicCategory.JAZZ);
        dump(jazzItems);
    }

    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        int size = catalog.size();
        System.out.println("Catalog size: " + size);

    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> allItems = catalog.getAll();
        dump(allItems);
    }

    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }
}