package rocks.zipcode.quiz4.arrays;

import rocks.zipcode.quiz4.fundamentals.Calculator;
import rocks.zipcode.quiz4.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return StringUtils.isEven(values.length) ? values[(values.length / 2) - 1] : values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> result = new ArrayList<>();

        for (String value : values){
            if (!value.equals(getMiddleElement(values))){
                result.add(value);
            }
        }

        return result.toArray(new String[0]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < values.length - 1; i++){
            result.add(values[i]);
        }

        return result.toArray(new String[0]);
    }
}