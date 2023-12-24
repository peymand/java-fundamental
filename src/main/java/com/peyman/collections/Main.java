package com.peyman.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //lookup
        //read to write ratio

        Map<String , Double> map = new HashMap<>();
        map.put("ali" , 15.6);
        map.put("reza" , 13.2);
        map.put("ahmad" , 17.1);
        map.put("sara" , 18d);
        map.put("reza" , 14d);

        for (Map.Entry<String , Double> item : map.entrySet() )
            System.out.println(item);
        // Map is a set of Entries

        ArrayList<Double> doubles = (ArrayList<Double>) map.values();
        int[] arr = {1,2,3};
        for (int i : arr) {

        }

        for ( Double item : doubles ){

        }
        Iterator<Double> doublesIterator = doubles.iterator();
        while (doublesIterator.hasNext()){
            Double item = doublesIterator.next();

        }


    }
}
