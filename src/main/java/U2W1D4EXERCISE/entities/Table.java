package U2W1D4EXERCISE.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
@ToString
@Entity
@jakarta.persistence.Table(name = "tables")

public class Table {
	@Id
	private UUID id = UUID.randomUUID();
	String ref;
	int seats;
	Boolean free = true;
	int occupiedPlaces = 0;

	public Table() {

	}

	public Table(String ref, int seats) {
		this.ref = ref;
		this.seats = seats;
	}

}
