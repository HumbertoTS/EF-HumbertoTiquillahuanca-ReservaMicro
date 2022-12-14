package EF.HT.MicroReserva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import EF.HT.MicroReserva.model.Reserva;
import EF.HT.MicroReserva.service.ReservaService;

@Controller
@RequestMapping("/api/reserva")
public class ReservaController {

	@Autowired
	private ReservaService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Reserva reserva) {
		service.guardarHospedaje(reserva);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarReserva();
	}
	
}
