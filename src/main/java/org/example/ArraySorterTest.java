package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
 import org.testng.annotations.Test;
 import org.openqa.selenium.WebDriver;

public class ArraySorterTest {
     WebDriver driver;
    @BeforeTest
    public void setUp() {
        // Set up your WebDriver and navigate to the page where the sorting function is available
         driver = new ChromeDriver();
        driver.get("https://your-website.com/array-sorter");
        driver.manage().window().maximize();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testSortPositiveNumbers() {
        // Test sorting an array of positive numbers
        int[] inputArray = {5, 3, 1, 7, 2};
        int[] expectedArray = {1, 2, 3, 5, 7};
        ArraySorter arraySorter = new ArraySorter(driver);
        int[] sortedArray = arraySorter.sorter(inputArray);

         Assert.assertEquals(sortedArray, expectedArray, "Array is not sorted correctly");
    }
    @Test
    public void testSortMixedNumbers() {
        // Test sorting an array of mixed positive and negative numbers
        int[] inputArray = {-5, 3, -1, 7, 2};
        int[] expectedArray = {-5, -1, 2, 3, 7};
        ArraySorter arraySorter = new ArraySorter(driver);
        int[] sortedArray = arraySorter.sorter(inputArray);
        Assert.assertEquals(sortedArray, expectedArray, "Array is not sorted correctly");
    }

    @Test
    public void testSortEmptyArray() {
        // Test sorting an empty array
        int[] inputArray = {};
        int[] expectedArray = {};
        ArraySorter arraySorter = new ArraySorter(driver);
        int[] sortedArray = arraySorter.sorter(inputArray);
        Assert.assertEquals(sortedArray, expectedArray, "Array is not sorted correctly");
    }



}

