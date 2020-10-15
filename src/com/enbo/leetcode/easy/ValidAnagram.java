package com.enbo.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by user on 2020/7/28.
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){return false;}
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c) + 1);
            }else{
                hashMap.put(c,1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(!hashMap.containsKey(c) || hashMap.get(c) == 0){
                return false;
            }else{
                hashMap.put(c, hashMap.get(c) - 1);
            }
        }
        return true;
    }
    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()){return false;}
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        return Arrays.equals(chars, chart);
    }

    public boolean isAnagram1(String s, String t) {
        if(s.length() != t.length()){return false;}
        StringBuilder stringBuilder = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            int location = stringBuilder.indexOf(String.valueOf(s.charAt(i)));
            if(-1 == location){return false;}
            stringBuilder.deleteCharAt(location);
        }
        return stringBuilder.length() == 0;
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("", ""));
        System.out.println(validAnagram.isAnagram("abc", "cab"));
        System.out.println(validAnagram.isAnagram("anagram", "anagram"));
        System.out.println(validAnagram.isAnagram("anagram1", "anagram"));
    }
}
