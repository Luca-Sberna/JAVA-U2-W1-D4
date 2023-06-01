package U2W1D4EXERCISE.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@Entity
public class ExtraPizzaSalamiDecorator extends ExtraPizzaDecorator {
	public ExtraPizzaSalamiDecorator() {
		super("Salami", 0.99, 66.0);
	}

	public ExtraPizzaSalamiDecorator(Consumation pizza) {
		super("Salami", 0.99, 66.0);
		this.decoratedPizza = pizza;
	}
}
