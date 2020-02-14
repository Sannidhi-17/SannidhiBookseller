package fr.epita.final_project.fetching_data;

import java.util.List;

import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * 
 * @author Sannidhi
 *
 */
public class LineChartSample {

	/**
	 * 
	 * @param primaryStage
	 * @throws Exception
	 */
	public LineChartSample(Stage primaryStage) throws Exception {
		// Set The Y-Axis
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("Fares");
		// Set The X-axis
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.setLabel("Names");

		// For Line Chart Graph
		LineChart<String, Number> lineChart = new LineChart<String, Number>(xAxis, yAxis);
		lineChart.autosize();
		lineChart.setTitle("Title");

		XYChart.Series<String, Number> series = new XYChart.Series<>();
		List<Fetching_data> data = ReadData.readAll();
		for (Fetching_data line : data) {
			Double fares = line.getFare();
			String name = line.getName();
			series.getData().add(new XYChart.Data<String, Number>(name, fares));

		}

		lineChart.getData().add(series);
		primaryStage.setTitle("Line Chart");
		Scene scene = new Scene(lineChart);
		primaryStage.setScene(scene);

		primaryStage.show();

	}
}
