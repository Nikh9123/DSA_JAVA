package Maths.medium ;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumber {

    public static String intToRoman(int num) {
        HashMap<Integer, String> numToCharMap = new LinkedHashMap<>() ;

         // Insert from highest to lowest
        numToCharMap.put(1000, "M");
        numToCharMap.put(900, "CM");
        numToCharMap.put(500, "D");
        numToCharMap.put(400, "CD");
        numToCharMap.put(100, "C");
        numToCharMap.put(90, "XC");
        numToCharMap.put(50, "L");
        numToCharMap.put(40, "XL");
        numToCharMap.put(10, "X");
        numToCharMap.put(9, "IX");
        numToCharMap.put(5, "V");
        numToCharMap.put(4, "IV");
        numToCharMap.put(1, "I");

        StringBuilder answBuilder = new StringBuilder();

        for(Map.Entry<Integer, String> entry : numToCharMap.entrySet()){

            while(num >= entry.getKey()){
                System.out.println("num : " + num + " and " + entry.getValue());
                answBuilder.append(entry.getValue());
                num -= entry.getKey() ;
            }
        }
        return answBuilder.toString() ;
    }

    public static void main(String[] args) {
        int num = 2059 ;

        System.out.println(intToRoman(num));
    }
}
