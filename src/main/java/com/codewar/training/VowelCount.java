package com.codewar.training;

public class VowelCount {
    public static int getCount(String str){
        int count = 0;
        for (char c : str.toCharArray()){
            count += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        }
        return count;
    }
}
