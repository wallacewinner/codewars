package com.codewar.training;

public class ReversedWords {
    public static String reverseWords(String str){
        String[] stringArray = str.split(" ");
        int stringArrayLength = stringArray.length;
        StringBuilder textreversed = new StringBuilder();
        while (stringArrayLength > 0){
            textreversed.append(stringArray[stringArrayLength - 1 ]).append(" ");
            stringArrayLength --;
        }
        return textreversed.toString().trim();
    }
}
