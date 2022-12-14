package EF.HT.MicroReserva.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
public class ReservaHospedajeFK implements Serializable{

	private static final long serialVersionUID = 6140260677662470483L;
	
	@Column(name="id_reserva", nullable = false, unique = true)
	private Integer idReserva;
	
	@Column(name="id_hospedaje", nullable = false, unique = true)
	private Integer idHospedaje;
	
	
}
