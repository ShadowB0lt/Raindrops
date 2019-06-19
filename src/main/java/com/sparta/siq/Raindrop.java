package com.sparta.siq;

public class Raindrop {

public String convertToString(int value) throws IllegalArgumentException{

    String result ="";

    if(value > 0) {

        if (value % 3 == 0) {
            result += "Pling";
        }
        if (value % 5 == 0) {
            result += "Plang";
        }
        if (value % 7 == 0) {
            result += "Plong";
        }
        if (value % 3 != 0 && value % 5 != 0 && value % 7 != 0) {
            result = Integer.toString(value);
        }
    }
    else if(value <=0)
    {
        throw new IllegalArgumentException("Enter a value greater than 0");
    }
   return result;
}

}
