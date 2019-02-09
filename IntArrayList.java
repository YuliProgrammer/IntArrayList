package com.arrlist;

import java.util.ArrayList;
import java.util.Arrays;

public class IntArrayList implements IntList {

    int[] elements = new int[10];
    int count = 0;

    @Override
    public void add(int value) {
        int size;

         if (count == elements.length )
         {
            size = ((elements.length * 3) / 2) + 1;
            int[] AllElements = new int[size];
            System.arraycopy(elements, 0, AllElements, 0, elements.length);

            elements = new int[size];

            elements = AllElements;
         }
        
        elements[count] = value;
        count++;

    }

    @Override
    public void add(int index, int element) {

        if (index > count || index < 0){
            System.out.println(" Error. Array index out of bounds exception");
        } else {

            int[] AllElements = new int[count];
            System.arraycopy(elements, 0, AllElements, 0, count);

            int[] newAllElements = new int[count + 1];
            int j = 0;
            for (int i = 0; i < newAllElements.length; i++){
                if (i == index){
                    newAllElements[i] = element;
                    continue;
                }
                newAllElements[i] = AllElements[j];
                j++;
            }

            elements = new int[count + 1];
            elements = newAllElements;
            count++;
        }
    }

    @Override
    public void clear() {
        elements = new int[0];
        count = 0;
    }

    @Override
    public boolean contains(int value) {
        int[] sortElements = new int[count];
        System.arraycopy(elements, 0, sortElements, 0, count);
        Arrays.sort(sortElements);

        int first = 0;
        int last = sortElements.length - 1;
        int middle = ( first + last ) / 2;

        while ( sortElements[middle] != value && first <= last){
            if (value < sortElements[middle]) {
                last --;
            } else {
                first ++;
            }

            middle = (first + last) / 2;
        }

        if (first <= last ){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int get(int index) {
        if (index >= count || index < 0 ){
            System.out.println(" Error. Array index out of bounds exception");
            return 0;
        }
        return elements[index];
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) return true;
        else return false;
    }

    @Override
    public int remove(int index) {

        if (index > count || index < 0){
            System.out.println(" Error. Array index out of bounds exception");
            return 0;
        }

        int[] AllElements = new int[count];

        System.arraycopy(elements, 0, AllElements, 0, count);
        System.out.println(Arrays.toString(AllElements));

        int[] newAllElements = new int[count-1];
        int j = 0;
        for (int i = 0; i < AllElements.length; i++){
            if (i == index){
                continue;
            }
            newAllElements[j] = AllElements[i];
            j++;

        }

        elements = new int[count-1];
        elements = newAllElements;
        count--;

        return 0;
    }

    @Override
    public void set(int index, int element) {

        if (index > count || index < 0){
            System.out.println(" Error. Array index out of bounds exception");
        } else{
            elements[index] = element;
        }

    }

    @Override
    public int size() {
        return count;
    }

    public void IntArrToString() {
        int[] allElements = new int[count];
        System.arraycopy(elements, 0, allElements, 0, count);
        System.out.println(Arrays.toString(allElements));
    }


}
