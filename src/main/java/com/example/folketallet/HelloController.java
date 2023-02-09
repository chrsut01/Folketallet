package com.example.folketallet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;

public class HelloController {

    @FXML
    private BarChart<String, Number> chart;
    public void drawChart(ActionEvent actionEvent) {
        Axis<String> xAxis = chart.getXAxis();
        xAxis.setLabel("Age");

        Axis<Number> yAxis = chart.getYAxis();
        yAxis.setLabel("Folketallet");

        XYChart.Series<String, Number> series2020 = new XYChart.Series<String, Number>();
        series2020.setName("Folketallet by year");

        series2020.getData().add(new XYChart.Data<>("0-2", 1018));
        series2020.getData().add(new XYChart.Data<>("3-5", 1103));

        XYChart.Series<String, Number> series2 = new XYChart.Series<String, Number>();
        series2020.setName("Folketallet by year");

        series2.getData().add(new XYChart.Data<>("0-2", 994));
        series2.getData().add(new XYChart.Data<>("3-5", 1020));


        chart.getData().add(series2020);

    }

}
