package fr.epita.final_project.test;

import fr.epita.final_project.fetching_data.AreaChartSample;
import fr.epita.final_project.fetching_data.DoubleBarChartSample;
import fr.epita.final_project.fetching_data.LineChartSample;
import fr.epita.final_project.fetching_data.PieChartSample;
import javafx.application.Application;
import javafx.stage.Stage;

public class test_main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Line Chart Graph
		LineChartSample linechart = new LineChartSample(primaryStage);
		// Pie Chart Graph
		PieChartSample pieChart = new PieChartSample(primaryStage);
		// Double Bar Chart Graph
		DoubleBarChartSample barsample = new DoubleBarChartSample(primaryStage);
		// Area Chart Sample Graph
		AreaChartSample areachart = new AreaChartSample(primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
