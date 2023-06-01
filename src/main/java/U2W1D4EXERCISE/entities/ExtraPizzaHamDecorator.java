package U2W1D4EXERCISE.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Entity
public class ExtraPizzaHamDecorator extends ExtraPizzaDecorator {

	public ExtraPizzaHamDecorator() {
		super("Ham", 0.99, 35.0);
	}

	public ExtraPizzaHamDecorator(Consumation pizza) {
		super("Ham", 0.99, 35.0);
		this.decoratedPizza = pizza;
	}
}
