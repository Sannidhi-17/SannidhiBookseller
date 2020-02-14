package fr.epita.final_project.fetching_data;

import java.util.List;
import java.util.stream.Collectors;

import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class AreaChartSample {
	/**
	 * Area Chart
	 * 
	 * @param stage
	 * @throws Exception
	 */
	public AreaChartSample(Stage stage) throws Exception {

		stage.setTitle("Area Chart Sample");
		final NumberAxis xAxis = new NumberAxis();
		final NumberAxis yAxis = new NumberAxis();
		final AreaChart<Number, Number> ac = new AreaChart<Number, Number>(xAxis, yAxis);
		ac.setTitle("Temperature Monitoring (in Degrees C)");

		XYChart.Series seriesApril = new XYChart.Series();
		seriesApril.setName("Male Survival");

		// Get All the data form the file
		List<Fetching_data> listData = ReadData.readAll();

		for (Fetching_data fetching_data : listData) {
			if (fetching_data.getPclass() == 1 && fetching_data.getSex().equals("male")
					&& fetching_data.getSurvived() == 1) {

			}
		}
		// For Male Survival
		List<Fetching_data> maleSurvivaloneclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 1
						&& fetching_data.getSex().equals("male") && fetching_data.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> maleSurvivaltwoclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 2
						&& fetching_data.getSex().equals("male") && fetching_data.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> maleSurvivalthreeclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 3
						&& fetching_data.getSex().equals("male") && fetching_data.getSurvived() == 1)
				.collect(Collectors.toList());

		// Adds data to the Graph
		seriesApril.getData().add(new XYChart.Data(1, maleSurvivaloneclass.size()));
		seriesApril.getData().add(new XYChart.Data(2, maleSurvivaltwoclass.size()));
		seriesApril.getData().add(new XYChart.Data(3, maleSurvivalthreeclass.size()));

		// For Female Survival
		List<Fetching_data> femaleSurvivaloneclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 1
						&& fetching_data.getSex().equals("female") && fetching_data.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> femaleSurvivaltwoclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 2
						&& fetching_data.getSex().equals("female") && fetching_data.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> femaleSurvivalthreeclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 3
						&& fetching_data.getSex().equals("female") && fetching_data.getSurvived() == 1)
				.collect(Collectors.toList());

		// Adds all data to the chart
		XYChart.Series seriesMay = new XYChart.Series();
		seriesMay.setName("Female Survival");
		seriesMay.getData().add(new XYChart.Data(1, femaleSurvivaloneclass.size()));
		seriesMay.getData().add(new XYChart.Data(2, femaleSurvivaltwoclass.size()));
		seriesMay.getData().add(new XYChart.Data(3, femaleSurvivalthreeclass.size()));

		// For Male Death
		List<Fetching_data> maledeathoneclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 1
						&& fetching_data.getSex().equals("male") && fetching_data.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> maledeathtwoclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 2
						&& fetching_data.getSex().equals("male") && fetching_data.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> maledeaththreeclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 3
						&& fetching_data.getSex().equals("male") && fetching_data.getSurvived() == 0)
				.collect(Collectors.toList());

		XYChart.Series seriesjuly = new XYChart.Series();

		// Adds the data to the chart
		seriesjuly.setName("Male Death");
		seriesjuly.getData().add(new XYChart.Data(1, maledeathoneclass.size()));
		seriesjuly.getData().add(new XYChart.Data(2, maledeathtwoclass.size()));
		seriesjuly.getData().add(new XYChart.Data(3, maledeaththreeclass.size()));

		// For Female Death.
		List<Fetching_data> femaledeathoneclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 1
						&& fetching_data.getSex().equals("female") && fetching_data.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> femaledeathtwoclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 2
						&& fetching_data.getSex().equals("female") && fetching_data.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> femaledeaththreeclass = listData
				.stream().filter(fetching_data -> fetching_data.getPclass() == 3
						&& fetching_data.getSex().equals("female") && fetching_data.getSurvived() == 0)
				.collect(Collectors.toList());

		XYChart.Series seriesjune = new XYChart.Series();

		// Adds the data to the chart
		seriesjune.setName("Female Death");
		seriesjune.getData().add(new XYChart.Data(1, femaledeathoneclass.size()));
		seriesjune.getData().add(new XYChart.Data(2, femaledeathtwoclass.size()));
		seriesjune.getData().add(new XYChart.Data(3, femaledeaththreeclass.size()));

		Scene scene = new Scene(ac, 800, 600);
		ac.getData().addAll(seriesApril, seriesMay, seriesjuly, seriesjune);
		stage.setScene(scene);
		stage.show();

	}
}
