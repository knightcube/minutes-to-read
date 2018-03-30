package com.example.mycoollibrary.minutestoreadlibrary;

/**
 * Created by Rajat Kumar Gupta on 30-03-2018.
 */

public class MinutesToRead {

    public static int getMinutesToRead(String text){

        int numberOfWords = 1;

        for (int i = 0; i < text.length() - 1; i++)
        {
            if ((text.charAt(i) == ' ') && (text.charAt(i + 1) != ' '))
            {
                numberOfWords++;

            }
        }

        int avgReadingTime = numberOfWords/200;

        if(avgReadingTime<1){
            return 1;
        }else{
            return avgReadingTime;
        }
    }

}
