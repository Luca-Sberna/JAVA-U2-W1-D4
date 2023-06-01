package U2W1D4EXERCISE.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
//@ToString
@Entity
public class ExtraPizzaPineAppleDecorator extends ExtraPizzaDecorator {
	public ExtraPizzaPineAppleDecorator() {
		super("PineApple", 0.79, 24.0);
	}

	public ExtraPizzaPineAppleDecorator(Consumation pizza) {
		super("PineApple", 0.79, 24.0);
		this.decoratedPizza = pizza;
	}
}
