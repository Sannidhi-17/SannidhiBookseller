package fr.epita.final_project.fetching_data;
/**
 * 
 * @author Sannidhi
 *
 */
public class Fetching_data {
	private Integer survived;
	private Integer pclass;
	private String name;
	private String sex;
	private double age;
	private Integer spouses_abroad;
	private Integer Children_abroad;
	private Double fare;

	public Integer getSurvived() {
		return survived;
	}

	public void setSurvived(Integer survived) {
		this.survived = survived;
	}

	public Integer getPclass() {
		return pclass;
	}

	public void setPclass(Integer pclass) {
		this.pclass = pclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Integer getSpouses_abroad() {
		return spouses_abroad;
	}

	public void setSpouses_abroad(Integer spouses_abroad) {
		this.spouses_abroad = spouses_abroad;
	}

	public Integer getChildren_abroad() {
		return Children_abroad;
	}

	public void setChildren_abroad(Integer children_abroad) {
		Children_abroad = children_abroad;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	public Fetching_data() {

	}

}
