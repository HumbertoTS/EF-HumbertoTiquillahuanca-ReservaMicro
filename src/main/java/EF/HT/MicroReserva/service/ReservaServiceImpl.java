package EF.HT.MicroReserva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EF.HT.MicroReserva.DTO.ReservaDTO;
import EF.HT.MicroReserva.cliente.OpenFeignClient;
import EF.HT.MicroReserva.model.Reserva;
import EF.HT.MicroReserva.model.ReservaHospedajeFK;
import EF.HT.MicroReserva.model.Reservadetalle;
import EF.HT.MicroReserva.repository.DetalleReservaRepository;
import EF.HT.MicroReserva.repository.ReservaRepository;


@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository repository;
	
	@Autowired
	private DetalleReservaRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void guardarHospedaje(Reserva reserva) {
		// TODO Auto-generated method stub
			repository.save(reserva);
	}

	@Override
	public void asignarReserva() {
		// TODO Auto-generated method stub
		List<ReservaDTO> listado = client.listarReservas();
		ReservaHospedajeFK fk= null;
		Reservadetalle detalle = null;
		for (ReservaDTO reserva : listado) {
			fk = new ReservaHospedajeFK();
			fk.setIdReserva(reserva.getId());
			fk.setIdHospedaje(1);
			
			detalle = new Reservadetalle();
			detalle.setFk(fk);			
			detalleRepo.save(detalle);
		}
		
		
	}

}
