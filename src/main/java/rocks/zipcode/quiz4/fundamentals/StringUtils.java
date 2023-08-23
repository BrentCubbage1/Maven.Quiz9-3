package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        boolean duplicate = false;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)) {
                duplicate = true;
                break;
            }
        }

        return duplicate;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        List<String> characterList = new ArrayList<>();
       String result = "";
        for(int i = 0; i < str.length(); i++){
            characterList.add(String.valueOf(str.charAt(i)));
        }
        for(int i = 0; i < characterList.size() - 1; i++){
            String checkedOne = characterList.get(i);
            String checkedTwo = characterList.get(i+1);
            String checkedThree = checkedTwo;
            if (i != 0){
                checkedThree = characterList.get(i - 1);
            }
            if(!checkedOne.equals(checkedTwo) && !checkedOne.equals(checkedThree)){
                result += checkedOne;
            }
        }
        result += characterList.get(characterList.size() - 1);
        return result;
    }

    public static String invertCasing(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toLowerCase(str.charAt(i))) {
                builder.append(Character.toUpperCase(str.charAt(i)));
            } else {
                builder.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        return builder.toString();
    }
}
