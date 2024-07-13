package com.dataroshi.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    void not_in_range() {
        assertEquals(-1, BinarySearch.search(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 10}, 20));
    }

    @Test
    void empty_array() {
        assertEquals(-1, BinarySearch.search(new int[]{}, 2));
    }

    @Test
    void even_elements() {
        assertEquals(2, BinarySearch.search(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 11, 12 }, 4));
    }

    @Test
    void odd_elements() {
        assertEquals(0, BinarySearch.search(new int[]{2, 3, 4, 5, 6, 7,9}, 2));
    }

    @Test
    void one_element() {
        assertEquals(0, BinarySearch.search(new int[]{4}, 4));
    }

    @Test
    void negative_numbers() {
        assertEquals(1, BinarySearch.search(new int[]{-4, -3, -2, -1, 0, 1, 2}, -3));
    }
}
