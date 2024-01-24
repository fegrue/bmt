package org.fegrue.bmt;

import javafx.scene.chart.LineChart;

import java.util.ArrayList;
import java.util.Collections;


public class Calculate {
    private ArrayList<Observer> observer;

    int max;
    int min;
    public ArrayList<Integer> l = new ArrayList<Integer>();
    public Calculate(int min, int max){

        observer = new ArrayList<Observer>();

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


    //Fügt einen Observer ein und benachrichtigt diesen
    public void addObserver(Observer o){
        observer.add(o);
    }

    //Entfernt einen Observer
    public void removeObserver(Observer o){
        observer.remove(o);
    }

    //Benachrichtigt alle Observer
    public void notifyLineChartChanged(LineChart<Integer, Integer> r){
        for(Observer o : observer){
            o.LineChartChanged(r);
        }
    }
    public void notifyStage(LineChart<Integer, Integer> r){
        for(Observer o : observer){
            o.LineChartChanged(r);
        }
    }

}
