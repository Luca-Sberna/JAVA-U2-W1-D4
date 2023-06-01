package U2W1D4EXERCISE.entities;

import java.util.UUID;

import jakarta.persistence.Id;
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
//@Entity
//@Table(name="ordinations")
public class Ordination {
	@Id
	private UUID id = UUID.randomUUID();
	private Consumation consumation;
	private int qty = 1;
	private String note;

	public Ordination(Consumation consumation, String note) {
		this.setConsumation(consumation);
		this.setNote(note);
	}

	public Ordination(Consumation consumation, String note, int qty) {
		this.setConsumation(consumation);
		this.setQty(qty);
		this.setNote(note);
	}

	public double getTotalValue() {
		return consumation.getPrice() * qty;
	}
}
