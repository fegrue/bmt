package org.fegrue.bmt;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MultiplicationTable {

    private int max;
    private int min;

    private int parts;

    private ArrayList<Integer> grid;

    public ArrayList<Integer> l = new ArrayList<Integer>();
    ArrayList<Integer> solution = new ArrayList<Integer>();
    MultiplicationTable( int min, int max, int parts) {
        this.max = max;
        this.min = min;
        this.parts = parts;

        //calculate Array
        for(int i = min;i < max;i++) {
            for (int j = min; j < max; j++) {
                this.l.add(i*j);
            }
        }
        Collections.sort(l);

        createGrid(parts);

        for (int i = 1; i <= parts; i++) {
            solution.add(0);
        }
        fillSolution();
    }


    public ArrayList<Integer> getA() {
        return solution;
    }


    private void createGrid(int parts){
        int num = l.getLast() / parts;
        solution = new ArrayList<Integer>(parts);
        grid = new ArrayList<Integer>(parts);
        for (int i = 1; i <= parts; i++) {
            grid.add(num * i);
        }

    }


    private void fillSolution(){
        for (int i : l) {
            int cp = calculatePart(i);
            solution.set(cp, solution.get(cp)+1);
        }
    }


    public ArrayList<Integer> setGrid(int b){
        for ( int i = 0; i< this.parts; i++ ){
            solution.set(i, 0);
        }
        solution = new ArrayList<Integer>(parts);
        createGrid(b);
        fillSolution();
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
