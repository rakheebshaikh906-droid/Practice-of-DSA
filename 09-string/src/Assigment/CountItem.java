package Assigment;
//https://leetcode.com/problems/count-items-matching-a-rule/description/
//1773. Count Items Matching a Rule
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class CountItem {
    static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            List<String> item = items.get(i);

            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
