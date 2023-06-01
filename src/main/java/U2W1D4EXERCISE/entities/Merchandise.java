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
//@ToString
//@Component
@Entity
@Table(name = "merchandise")
@NoArgsConstructor
public class Merchandise extends Product {
	public Merchandise(String name, Double price) {
		super(name, price);
	}

	@Override
	public String toString() {
		return "Merchandise{" + "name='" + name + '\'' + ", price=" + price + '}';
	}
}
