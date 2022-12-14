package EF.HT.MicroReserva.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "detalle_reserva")
public class Reservadetalle {

	@Id
	private ReservaHospedajeFK fk = new ReservaHospedajeFK();
}
