package U2W1D4EXERCISE.entities;

import java.util.UUID;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
@NoArgsConstructor
@MappedSuperclass
public abstract class Product {
	@Id
	private UUID id = UUID.randomUUID();
	String name;
	Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
}
