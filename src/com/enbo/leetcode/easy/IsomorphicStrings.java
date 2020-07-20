package com.enbo.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 2020/7/10.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        return oneDirection(s, t) && oneDirection(t, s);
    }
    public boolean oneDirection(String s, String t){
        if(s.length() != t.length()){return false;}
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if (map.keySet().contains(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)){return false;}
            }else{
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
    public String helper(String s){
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.toString();
    }
    public static void main(String[] args) {

    }
}
