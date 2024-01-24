package org.fegrue.bmt;


import javafx.scene.chart.LineChart;

public interface Observer {
    void LineChartChanged(LineChart<Integer, Integer> rule);

    void notifyStage(LineChart<Integer, Integer> r);

}