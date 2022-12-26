package com.codewar.training;

import java.text.DecimalFormat;

public class NthSeries {
    static DecimalFormat df = new DecimalFormat("0.00");

    public static String seriesSum(int i) {
        double result = 0;
        var initial = 1;
        for (var j = 1; j <= i; j++) {
            result += (1/ (double) initial);
            initial += 3;
        }
        return String.valueOf(df.format(result));
    }
}
