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
    public ArrayList<Integer> l = new ArrayList<>();
    ArrayList<Integer> solution = new ArrayList<>();


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

        fillgrid();
    }


    public ArrayList<Integer> getA() {
        return solution;
    }


    private void createGrid(int parts){
        int num = l.getLast() / parts;
        grid = new ArrayList<>(parts);
        for (int i = 1; i <= parts; i++) {
            grid.add(num * i);
        }
    }


    private void fillgrid(){
        createGrid(parts);
        for (int i = 1; i <= parts; i++) {
            solution.add(0);
        }
        fillSolution();
    }

    private void fillSolution(){
        for (int i : l) {
            int cp = calculatePart(i);
            this.solution.set(cp, solution.get(cp)+1);
        }
    }


    public ArrayList<Integer> setGrid(int b){
        parts = b;
        int size = solution.size();
        for (int i = 0;i< size; i++){
            solution.removeLast();
        }
        fillgrid();
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
