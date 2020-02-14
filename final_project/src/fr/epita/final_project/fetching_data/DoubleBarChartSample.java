package fr.epita.final_project.fetching_data;

import java.util.List;
import java.util.stream.Collectors;

import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class DoubleBarChartSample {
	/**
	 * Double Bar Chart.
	 * 
	 * @param stage
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public DoubleBarChartSample(Stage stage) throws Exception {
		// XYBar Names
		final String maleSurvival = "Male Survival";
		final String femaleSurvival = "Female Survival";
		final String maledeath = "Male Death";
		final String femaledeath = "Female Death";

		// Age in intervals
		final String ZE = "0-18";
		final String NF = "19-40";
		final String FS = "41-60";
		final String SE = "61-80";

		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();

		final XYChart.Series<String, Number> ZeroEighteen = new XYChart.Series<>();
		final XYChart.Series<String, Number> ninteen = new XYChart.Series<>();
		final XYChart.Series<String, Number> fortyone = new XYChart.Series<>();
		final XYChart.Series<String, Number> sixtyone = new XYChart.Series<>();

		stage.setTitle("Bar Chart");
		final BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
		barChart.setTitle("Shares of expenditures by Country");

		xAxis.setLabel("Category");
		yAxis.setLabel("Percentage");

		List<Fetching_data> listdata = ReadData.readAll();

		List<Fetching_data> maleSurvivalzero = listdata.stream()
				.filter(p -> (p.getAge() <= 18 && p.getAge() > 0) && p.getSex().equals("male") && p.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> maleSurvivalningthy = listdata.stream().filter(
				p -> (p.getAge() <= 40 && p.getAge() >= 19) && p.getSex().equals("male") && p.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> maleSurvivalfortyone = listdata.stream().filter(
				p -> (p.getAge() <= 60 && p.getAge() >= 41) && p.getSex().equals("male") && p.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> malesurvivalSiztyone = listdata.stream().filter(
				p -> (p.getAge() <= 80 && p.getAge() >= 61) && p.getSex().equals("male") && p.getSurvived() == 1)
				.collect(Collectors.toList());

		ZeroEighteen.setName(maleSurvival);
		addDataItem(ZeroEighteen, ZE, maleSurvivalzero.size());
		addDataItem(ZeroEighteen, NF, maleSurvivalningthy.size());
		addDataItem(ZeroEighteen, FS, maleSurvivalfortyone.size());
		addDataItem(ZeroEighteen, SE, malesurvivalSiztyone.size());

		List<Fetching_data> femaleSurvivalzero = listdata.stream().filter(
				p -> (p.getAge() <= 18 && p.getAge() > 0) && p.getSex().equals("female") && p.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> femaleSurvivalningthy = listdata.stream().filter(
				p -> (p.getAge() <= 40 && p.getAge() >= 19) && p.getSex().equals("female") && p.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> femaleSurvivalfortyone = listdata.stream().filter(
				p -> (p.getAge() <= 60 && p.getAge() >= 41) && p.getSex().equals("female") && p.getSurvived() == 1)
				.collect(Collectors.toList());

		List<Fetching_data> femalesurvivalSiztyone = listdata.stream().filter(
				p -> (p.getAge() <= 80 && p.getAge() >= 61) && p.getSex().equals("female") && p.getSurvived() == 1)
				.collect(Collectors.toList());

		ninteen.setName(femaleSurvival);
		addDataItem(ninteen, ZE, femaleSurvivalzero.size());
		addDataItem(ninteen, NF, femaleSurvivalningthy.size());
		addDataItem(ninteen, FS, femaleSurvivalfortyone.size());
		addDataItem(ninteen, SE, femalesurvivalSiztyone.size());

		List<Fetching_data> maledeathzero = listdata.stream()
				.filter(p -> (p.getAge() <= 18 && p.getAge() > 0) && p.getSex().equals("male") && p.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> maledeathningthy = listdata.stream().filter(
				p -> (p.getAge() <= 40 && p.getAge() >= 19) && p.getSex().equals("male") && p.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> maledeathfortyone = listdata.stream().filter(
				p -> (p.getAge() <= 60 && p.getAge() >= 41) && p.getSex().equals("male") && p.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> maledeathSiztyone = listdata.stream().filter(
				p -> (p.getAge() <= 80 && p.getAge() >= 61) && p.getSex().equals("male") && p.getSurvived() == 0)
				.collect(Collectors.toList());

		fortyone.setName(maledeath);
		addDataItem(fortyone, ZE, maledeathzero.size());
		addDataItem(fortyone, NF, maledeathningthy.size());
		addDataItem(fortyone, FS, maledeathfortyone.size());
		addDataItem(fortyone, SE, maledeathSiztyone.size());

		List<Fetching_data> femaledeathzero = listdata.stream().filter(
				p -> (p.getAge() <= 18 && p.getAge() > 0) && p.getSex().equals("female") && p.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> femaledeathningthy = listdata.stream().filter(
				p -> (p.getAge() <= 40 && p.getAge() >= 19) && p.getSex().equals("female") && p.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> femaledeathfortyone = listdata.stream().filter(
				p -> (p.getAge() <= 60 && p.getAge() >= 41) && p.getSex().equals("female") && p.getSurvived() == 0)
				.collect(Collectors.toList());

		List<Fetching_data> femaledeathSiztyone = listdata.stream().filter(
				p -> (p.getAge() <= 80 && p.getAge() >= 61) && p.getSex().equals("female") && p.getSurvived() == 0)
				.collect(Collectors.toList());
		
		sixtyone.setName(femaledeath);
		addDataItem(sixtyone, ZE, femaledeathzero.size());
		addDataItem(sixtyone, NF, femaledeathningthy.size());
		addDataItem(sixtyone, FS, femaledeathfortyone.size());
		addDataItem(sixtyone, SE, femaledeathSiztyone.size());

		Scene scene = new Scene(barChart, 800, 600);
		barChart.getData().addAll(ZeroEighteen, ninteen, fortyone, sixtyone);
		stage.setScene(scene);
		stage.show();
	}

	public void addDataItem(XYChart.Series<String, Number> series, String x, Number y) {
		series.getData().add(new XYChart.Data<>(x, y));
	}
}
