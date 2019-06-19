package com.sparta.siq;

public class Raindrop {



public String factor(int value)
{

    String result = "";

    for(int i = 1;i<=value;i++)
    {
        if(value%i == 0) {

            if(i == 3)
            {
                result += "Pling";
            }
            else if(i == 5)
            {
                result += "Plang";
            }
            else if(i == 7)
            {
                result += "Plong";
            }
            else if(value%3!=0 && value%5!=0 && value%7!=0)
            {
                result = Integer.toString(i);
            }
        }
    }
    return result;
}

}
