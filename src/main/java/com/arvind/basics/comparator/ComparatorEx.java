package com.arvind.basics.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
    public static void main(String[] args) {

        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(1);
        ls.add(5);
        ls.add(4);

        ls.sort(new Comparator<Integer>(){

            public int compare(Integer num1, Integer num2) {
                return num1 + num2;
            }
        });



    }
}
