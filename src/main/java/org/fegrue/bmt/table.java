package org.fegrue.bmt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class table {
    ArrayList<Integer> solution = new ArrayList<Integer>();
    ArrayList<Integer> grid;
    table(ArrayList<Integer> l, int parts) {
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
}
