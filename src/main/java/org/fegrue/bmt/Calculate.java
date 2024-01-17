package org.fegrue.bmt;

import java.util.ArrayList;
import java.util.Collections;

public class Calculate {
    int max;
    int min;
    public ArrayList<Integer> l = new ArrayList<Integer>();
    public Calculate(int min, int max){
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
