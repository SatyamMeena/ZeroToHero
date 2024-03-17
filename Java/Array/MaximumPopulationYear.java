package Java.Array;

import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        // int logs[][] = { { 1982, 1998 }, { 2013, 2042 }, { 2010, 2035 }, { 2022, 2050
        // }, { 2047, 2048 } };
        int logs[][] = { { 2025, 2041 }, { 1988, 2007 }, { 2003, 2046 }, { 2045, 2049 }, { 2025, 2027 }, { 2014, 2040 },
                { 2014, 2027 }, { 2011, 2027 }, { 1972, 2019 } };
        System.out.println(maximumPopulation(logs));
    }

    static int maximumPopulation(int[][] arr) {
        int[] years = new int[101];
        for (int[] log : arr) {
            years[log[0] - 1950] += 1;
            years[log[1] - 1950] -= 1;
        }

        int maxNum = years[0];
        int maxYear = 0;

        for (int i = 1; i < years.length; i++) {
            years[i] += years[i - 1];
            if (years[i] > maxNum) {
                maxNum = years[i];
                maxYear = i;
            }
        }
        return maxYear + 1950;
    }
}