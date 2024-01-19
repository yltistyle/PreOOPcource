package edu.penzgtu.oop.Application;

import java.util.ArrayList;
import java.util.Arrays;

public class Profit {
    public static void main( String[] args ) {
        ArrayList<Integer> stocks = new ArrayList<>(Arrays.asList(7,1,5,3,6,4));
        System.out.println(stocks + "\nresult: " +maxProfit(stocks));
    }

    private static int maxProfit(ArrayList<Integer> stocks) {
        int lsf = Integer.MAX_VALUE;
        int profit = 0;
        int pist = 0;

        for(int i = 0; i < stocks.size(); i++){
            if(stocks.get(i) < lsf){
                lsf = stocks.get(i);
            }
            pist = stocks.get(i) - lsf;
            if(profit < pist){
                profit = pist;
            }
        }
        return profit;
    }
}
