package Assigment;

import java.util.Arrays;

// https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/
// 2491. Divide Players Into Teams of Equal Skill

public class DividePlayersIntoTeamsOfEqualSkill {
    static void main(String[] args) {
        int[] skill = {3, 2, 5, 1, 3, 4};
        System.out.println(dividePlayers(skill));
    }
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        int totalSum = 0;
        int n = skill.length;
        for (int i = 0; i < skill.length; i++) {
            totalSum += skill[i];
        }
        int pairs = n / 2;

        if (totalSum % pairs != 0) {
            return -1;
        }
        int target = totalSum / pairs;

        int left = 0;
        long sum = 0;
        int right = skill.length - 1;

        while (left < right) {
            if (skill[left] + skill[right] != target) {
                return -1;
            }
            sum += (long) skill[left] * skill[right];
            left++;
            right--;
        }
        return sum;
    }
}
