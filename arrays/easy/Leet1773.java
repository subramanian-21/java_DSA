package easy;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * You are given an array items, where each items[i] = [typei, colori, namei]
 * describes the type, color, and name of the ith item. You are also given a
 * rule represented by two strings, ruleKey and ruleValue.
 * 
 * The ith item is said to match the rule if one of the following is true:
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * 
 * Return the number of items that match the given rule.
 */
public class Leet1773 {
    public static void main(String[] args) {
        String[][] arr = { { "phone", "blue", "pixel" }, { "computer", "silver", "lenovo" },
                { "phone", "gold", "iphone" } };

        List<List<String>> arrr = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {
            List<String> arrList = new ArrayList<>();
            for (int i = 0; i < arr[index].length; i++) {
                arrList.add(arr[index][i]);
            }
            arrr.add(arrList);
        }
        System.out.println(arrr);
        System.out.println(countMatches(arrr, "color", "silver"));

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int out = 0;
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if (ruleValue.equals(items.get(i).get(index))) {
                out++;
            }
        }
        return out;
    }

}
