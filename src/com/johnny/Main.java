package com.johnny;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void printArray(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            System.out.print(" " + array.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> bubbleSort = new ArrayList<>(Arrays.asList(5, 1, 4, 2, 8));

        boolean keepGoing = true;
        while (keepGoing)
        {
            boolean swaped = false;
            for (int i = 0; i < bubbleSort.size() - 1; i++) {
                int j = i + 1;
                int iValue = bubbleSort.get(i);

                if (bubbleSort.get(j) < iValue)
                {
                    bubbleSort.set(i, bubbleSort.get(j));
                    bubbleSort.set(j, iValue);
                    swaped = true;
                }
                printArray(bubbleSort);
            }
            keepGoing = swaped;
        }
//        printArray(bubbleSort);
    }
}
