package com.sparta.siq;

import java.util.HashMap;
import java.util.Map;

public class Raindrop {

public String convertToString(int value) throws IllegalArgumentException{

    String result ="";

    Map<Integer,String>  storage = new HashMap();

    storage.put(3,"Pling");
    storage.put(5,"Plang");
    storage.put(7,"Plong");
    storage.put(9,"Plung");

    for(Map.Entry<Integer,String> entry : storage.entrySet())
    {
        if(value % entry.getKey() == 0)
        {
            result+= entry.getValue();
        }
    }
    if(result == "")
    {
        return Integer.toString(value);
    }

   return result;
}
}
