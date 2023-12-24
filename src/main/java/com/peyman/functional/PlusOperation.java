package com.peyman.functional;

@FunctionalInterface
public interface PlusOperation<T extends Number> {

    T add(T t1 , T t2);


}
