package com.company;

import java.util.HashMap;
import java.util.Map;

// This a a code written by DroneCodes

// This is a solution to the problem 13 in leetcode

// i hope it helps :)

public class Roman_to_Integer {

    /*
        To solve this problem we create an HahMap, then we fill the map with all respective values of the roman numerals and their corresponding Integer values
        then we get the length of the String we are to solve for,
        create a new field to store the result
        then we make a for loop to go through each characters from left to right,
        then after checking the size of the integer we can finally return the integer corresponding to the Roman TestCase
     */

    class Solution {
        public int romanToInt(String s) {
            // Map to store romans numerals
            Map<Character, Integer> romanMap = new HashMap<>();
            // Fill the map
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);
            // Length of the given string
            int n = s.length();
            // Variable to store result
            int num = romanMap.get(s.charAt(n - 1));
            // Loop for each character from right to left
            for (int i = n - 2; i >= 0; i--) {
                // Check if the character at right of current character is
                // bigger or smaller
                if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                    num += romanMap.get(s.charAt(i));
                } else {
                    num -= romanMap.get(s.charAt(i));
                }
            }
            return num;
        }
    }
}
