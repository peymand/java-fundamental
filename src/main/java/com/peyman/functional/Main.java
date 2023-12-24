package com.peyman.functional;

import com.peyman.collections.DummyClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        PlusOperation<Integer> plusInt = (in1, in2) -> in1 + in2;
        f(plusInt);
        int res = plusInt.add(2, 3);
//        System.out.print(res);

        Consumer<String> consumerStr = s -> System.out.println(s);
        Predicate<String> checkIfStringIsDigit = s -> !s.matches("[0-9]+");
        Function<String , Integer> strLen = s -> s.length();
        BiFunction<String , Integer , Character> charAT =  (str , in)  -> str.charAt(in);
        DummyClass d = new DummyClass();
        Consumer<String> fx = d::x;

        ArrayList<String> list = new ArrayList<String>() {{
            add("ali");
            add("reza9d");
            add("sar8a");
            add("1400");
        }};
        Stream<String> stream = list.stream();
        ArrayList<Integer> collect = (ArrayList<Integer>) stream.filter(s -> s.matches("[0-9]+"))
                .map(Integer::parseInt).collect(Collectors.toList());


    }

    static void f(PlusOperation operation) {
        operation.add(2, 3);
    }


    public static void f2(int ... x ){
        if(x.length> 10){
            for (int i = 0; i < x.length; i++) {
                System.out.println(String.valueOf(x[i]));
            }
        }
    }

}
