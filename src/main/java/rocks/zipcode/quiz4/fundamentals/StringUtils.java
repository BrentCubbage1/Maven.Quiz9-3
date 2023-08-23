package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {

    public static boolean isEven(int i){
        return i % 2 == 0;
    }

    public static Character getMiddleCharacter(String string) {
        Character middleChar;
        Integer lastIndex = string.length() - 1;
        if( isEven(lastIndex)){
            middleChar = string.charAt(lastIndex / 2);
        } else {
            middleChar = string.charAt((lastIndex / 2) - 1);
        }
        return middleChar;
    }

    public static String capitalizeMiddleCharacter(String str) {
        //The most hideous code in my life
        Integer middleIndex;
        Integer lastIndex = str.length() - 1;
        if( isEven(lastIndex)){
            middleIndex = lastIndex / 2;
        } else {
            middleIndex = (lastIndex / 2) - 1;
        }
       char[] characters = str.toCharArray();
        characters[middleIndex] = Character.toUpperCase(characters[middleIndex]);
        String result = "";
        for (char character : characters){
            result += character;
        }

        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        //The most hideous code in my life pt. 2
        Integer middleIndex;
        Integer lastIndex = str.length() - 1;
        if( isEven(lastIndex)){
            middleIndex = lastIndex / 2;
        } else {
            middleIndex = (lastIndex / 2) - 1;
        }
        char[] characters = str.toCharArray();
        characters[middleIndex] = Character.toLowerCase(characters[middleIndex]);
        String result = "";
        for (char character : characters){
            result += character;
        }

        return result;
    }

    /* isogram (plural isograms) A word or phrase in which each letter occurs the same number of times. read the tests. */
    public static Boolean isIsogram(String str) {
        Boolean isogram = true;
        int count = 0;
        //Here - Works
        //XXX - Doesn't work
        for (int i = 0; i < str.length(); i++) {
            int temp = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    temp++;
                }
                if (temp > 1) {
                    isogram = false;
                }
            }
        }
        return isogram;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}
