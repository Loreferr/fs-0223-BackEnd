package Classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PizzaBase {

	private String Name;
	private Double Price;
	private Double Calories;

	public String getMenuLine() {
		return this.Name + "+ Calories:" + this.Calories + "+ Price:" + this.Price;
	}
}
