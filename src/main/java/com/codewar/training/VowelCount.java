package com.codewar.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static int getCount(String str){
        Pattern pattern = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
