package org.fegrue.bmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class calculate {
    int max;
    int min;
    public ArrayList<Integer> l = new ArrayList<Integer>();
    public calculate(int min, int max){
        this.max = max;
        this.min = min;

            }
    public void createArray(){
        for(int i = min;i < max;i++) {
            for (int j = min; j < max; j++) {
                this.l.add(i*j);
            }
        }
        Collections.sort(l);
    }

    public int getMaxValue(){
        return l.getLast();
    }
}
