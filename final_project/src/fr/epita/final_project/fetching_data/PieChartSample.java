package fr.epita.final_project.fetching_data;

import java.io.IOException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;

public class PieChartSample {
	/**
	 * 
	 * @param primaryStage
	 * @throws IOException
	 */
	public PieChartSample(Stage primaryStage) throws IOException {

		PieChart chart = new PieChart();

		chart.setData(getChartData());

		primaryStage.setTitle("Line Chart");
		Scene scene = new Scene(chart);
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	// Create PieChart Data
	/**
	 * 
	 * @return data and add to pie chart
	 * @throws IOException
	 */
	private static ObservableList<PieChart.Data> getChartData() throws IOException {
		ObservableList<PieChart.Data> data = FXCollections.observableArrayList();

		List<Fetching_data> listData = ReadData.readAll();
		int malecounter = 0;
		int femalecounter = 0;
		for (Fetching_data fetching_data : listData) {
			if (fetching_data.getSex().contains("male")) {
				malecounter++;
			}

			if (fetching_data.getSex().contains("female")) {
				femalecounter++;
			}
		}
		data.add(new PieChart.Data("Male", malecounter));
		data.add(new PieChart.Data("Female", femalecounter));

		return data;
	}
}
