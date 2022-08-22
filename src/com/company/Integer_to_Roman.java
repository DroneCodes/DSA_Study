package com.company;

public class Integer_to_Roman {

    // This a a code written by DroneCodes

    // This is a solution to the Integer to Roman problem in leetcode

    // i hope it helps :)

    public String intToRoman(int num) {

        /* we create four arrays given that we can have four different values namely;
        1. Ones
        2. Tens
        3. Hundreds
        4. Thousands

        for the zero value it would be an empty String ("") since Roman numeral epresentation of zero is not available

        for M which is the Thousand representation we can have three values according to the question which says theinteger value is less than 3999 (<3999),
        C is the representation of the available Hundreds availabe in the Roman numerals
        X is the representation of the available Tens availabe in the Roman numerals
        I is the representation of the available Ones availabe in the Roman numerals

        */

        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
}
