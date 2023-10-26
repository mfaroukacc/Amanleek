package org.example;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;

public class ArraySorter {
    public ArraySorter(WebDriver driver) {
    }

    public int[] sorter(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // Return an empty array if the input array is null or empty
        } else {
            Arrays.sort(arr); // Sort the array in ascending order
            return arr;
        }
    }
}
