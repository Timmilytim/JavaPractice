package com.setP;

public class Main {
    public static void main(String[] args) {
        WildCardUpperBound<Integer> num1 = new WildCardUpperBound<>();
        num1.setT(23);

        WildCardUpperBound<Double> num2 = new WildCardUpperBound<>();
        num2.setT(23.2);
        addNum(num1, num2);

    }
    public static void addNum(WildCardUpperBound <? extends Number> num1,
                              WildCardUpperBound <? extends Number> num2){

        Integer fnum = (Integer) num1.getT();
        Double fnum2 = (Double) num2.getT();
        System.out.println(fnum + fnum2);

    }

}
