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
@Table(name = "pizze")
@NoArgsConstructor
public class Pizza extends Consumation {
//    public Pizza() {
//        super("margherita",1.0,2.0);
//
//    }

	public Pizza(String name) {
		super(name, 4.99, 1104.0);
	}

	@Override
	public String toString() {
		return "Pizza{" + "calories=" + calories + ", name='" + name + '\'' + ", price=" + price + '}';
	}
}
