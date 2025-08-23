package Maths.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int i = 0;
        while(i < s.length()-1) {

            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                System.out.println("i in if : " + i);
                ans += map.get(s.charAt(i));
                i++ ;
            } else {
                System.out.println("i in else : " + i);
                int value = map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                ans += value;
                i = i + 2;
            }
        }
        
        System.out.println("bahar" + (i) + " and " + s.length());
        if (i + 1 == s.length()) {
            System.out.println("hello" + (i + 1) + " and " + s.length());
            ans += map.get(s.charAt(s.length() - 1));
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("LVIII"));
    }
}
