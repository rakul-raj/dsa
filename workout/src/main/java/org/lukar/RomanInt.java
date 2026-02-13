package org.lukar;

import java.util.HashMap;
import java.util.Map;

public class RomanInt {

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }

    /**
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int sum = 0;

        for (int index = 0; index < s.length() ; index++) {
            int curr = map.get(s.charAt(index));
            int next = (index + 1 < s.length()) ? map.get(s.charAt(index + 1)) : 0;

            if (curr < next) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }
}
