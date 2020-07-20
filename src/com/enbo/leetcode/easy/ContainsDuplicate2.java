package com.enbo.leetcode.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 2020/7/11.
 */
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){return true;}
            set.add(nums[i]);
            if(set.size() > k){set.remove(nums[i-k]);}
        }
        return false;
    }

    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < Math.min(i+k+1, nums.length); j++) {
                if(nums[i] == nums[j]) {return true;}
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate2 containsNearbyDuplicate2 = new ContainsDuplicate2();
        System.out.println(containsNearbyDuplicate2.containsNearbyDuplicate(new int[]{1,2,3,1,8}, 3));
        System.out.println(containsNearbyDuplicate2.containsNearbyDuplicate(new int[]{1,2,3,1,8}, 2));
    }
}
