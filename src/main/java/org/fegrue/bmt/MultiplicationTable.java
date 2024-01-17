package org.fegrue.bmt;

import java.util.ArrayList;
import java.util.Collections;

public class MultiplicationTable {

    private int max;
    private int min;

    public ArrayList<Integer> l = new ArrayList<Integer>();
    ArrayList<Integer> solution = new ArrayList<Integer>();
    ArrayList<Integer> grid;
    MultiplicationTable( int min, int max, int parts) {
        calculate(min, max);
        int num = l.getLast() / parts;
        grid = new ArrayList<Integer>(parts);
        for (int i = 1; i <= parts; i++) {
            grid.add(num * i);
        }
        for (int i = 1; i <= parts; i++) {
            solution.add(0);
        }
        for (int i : l) {
            int cp = calculatePart(i);
            solution.set(cp, solution.get(cp)+1);
        }
    }
        public ArrayList<Integer> getA() {
            return solution;
        }


    private int calculatePart(int value){
        for (int i : grid){
            if (value<i){
                if (i == value){
                    return grid.indexOf(i);
                }
                return grid.indexOf(i);
            }
        }
    return grid.indexOf(grid.getLast());
    }


    public void calculate(int min, int max){
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
