package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void testAddWithNegativeNumber() {
        assertEquals(-1, App.add(2, -3));
    }

    @Test
    public void testAddWithZero() {
        assertEquals(7, App.add(7, 0));
    }

    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(App.isPrime(7));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(App.isPrime(9));
    }

    @Test
    public void testIsPrimeWithNumberLessThanTwo() {
        assertFalse(App.isPrime(1));
        assertFalse(App.isPrime(0));
        assertFalse(App.isPrime(-5));
    }

    @Test
    public void testIsPrimeWithTwo() {
        assertTrue(App.isPrime(2));
    }

    @Test
    public void testReverseRegularString() {
        assertEquals("olleh", App.reverse("hello"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", App.reverse(""));
    }

    @Test
    public void testReverseSingleCharacter() {
        assertEquals("a", App.reverse("a"));
    }

    @Test
    public void testFactorialPositiveNumber() {
        assertEquals(120, App.factorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, App.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, App.factorial(1));
    }

    @Test
    public void testFactorialNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> App.factorial(-3));
    }

    @Test
    public void testIsPalindromeRegularPalindrome() {
        assertTrue(App.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindromeNotPalindrome() {
        assertFalse(App.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithSpacesAndCapitalLetters() {
        assertTrue(App.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testIsPalindromeWithSymbols() {
        assertTrue(App.isPalindrome("Madam!"));
    }

    @Test
    public void testFibonacciUpToTen() {
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8);
        assertEquals(expected, App.fibonacciUpTo(10));
    }

    @Test
    public void testFibonacciUpToZero() {
        List<Integer> expected = Arrays.asList(0);
        assertEquals(expected, App.fibonacciUpTo(0));
    }

    @Test
    public void testFibonacciNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-1));
    }

    @Test
    public void testCharFrequencyRegularString() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 1);

        assertEquals(expected, App.charFrequency("aba"));
    }

    @Test
    public void testCharFrequencyEmptyString() {
        Map<Character, Integer> expected = new HashMap<>();

        assertEquals(expected, App.charFrequency(""));
    }

    @Test
    public void testIsAnagramTrue() {
        assertTrue(App.isAnagram("listen", "silent"));
    }

    @Test
    public void testIsAnagramFalse() {
        assertFalse(App.isAnagram("hello", "world"));
    }

    @Test
    public void testIsAnagramWithSpacesAndCapitalLetters() {
        assertTrue(App.isAnagram("Dormitory", "Dirty room"));
    }

    @Test
    public void testAverageRegularArray() {
        assertEquals(3.0, App.average(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        assertEquals(-2.0, App.average(new int[]{-1, -2, -3}));
    }

    @Test
    public void testAverageEmptyArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> App.average(new int[]{}));
    }

    @Test
    public void testFilterEvensRegularList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected = Arrays.asList(2, 4, 6);

        assertEquals(expected, App.filterEvens(input));
    }

    @Test
    public void testFilterEvensNoEvenNumbers() {
        List<Integer> input = Arrays.asList(1, 3, 5);
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, App.filterEvens(input));
    }

    @Test
    public void testFilterEvensEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, App.filterEvens(input));
    }

    @Test
    public void testMostCommonWordRegularText() {
        assertEquals("hello", App.mostCommonWord("hello world hello"));
    }

    @Test
    public void testMostCommonWordWithCapitalLetters() {
        assertEquals("java", App.mostCommonWord("Java is fun java"));
    }
}