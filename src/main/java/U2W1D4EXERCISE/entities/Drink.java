package U2W1D4EXERCISE.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Entity
@Table(name = "drinks")
@NoArgsConstructor
public class Drink extends Consumation {

	public Drink(String name, Double price, Double calories) {
		super(name, price, calories);
	}

	@Override
	public String toString() {
		return "Drink{" + "calories=" + calories + ", name='" + name + '\'' + ", price=" + price + '}';
	}
}
