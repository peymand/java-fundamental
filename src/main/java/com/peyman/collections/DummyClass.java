package com.peyman.collections;

public class DummyClass implements dummy{
    @Override
    public void put() {

    }

    public void x(String item){

    }

    public boolean y(String s1 ,String s2 , String s3 ){
        if(s1.length() > s2.length() && s1.length() > s3.length())
            return true;
        else
            return false;
    }
}
