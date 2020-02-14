package fr.epita.final_project.fetching_data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import fr.epita.final_project.fetching_data.Fetching_data;

public class ReadData {
	/**
	 * 
	 * @return read all the data for the file and set to the model class
	 * @throws IOException
	 */
	public static List<Fetching_data> readAll() throws IOException {
		List<Fetching_data> AllData = new ArrayList<>();
		List<String> lines = Files.readAllLines(new File("E:\\EPITA\\JAVA\\input.csv").toPath());
		lines.remove(0);

		for (String line : lines) {
			String[] parts = line.split(",");
			Fetching_data model = new Fetching_data();
			model.setSurvived(Integer.valueOf(parts[0]));
			model.setPclass(Integer.valueOf(parts[1]));
			model.setName(parts[2]);
			model.setSex(parts[3]);
			model.setAge(Double.parseDouble(parts[4]));
			model.setSpouses_abroad(Integer.valueOf(parts[5]));
			model.setChildren_abroad(Integer.valueOf(parts[6]));
			model.setFare(Double.valueOf(parts[7]));
			AllData.add(model);

		}

		return AllData;

	}

}
