package EF.HT.MicroReserva.cliente;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import EF.HT.MicroReserva.DTO.ReservaDTO;

@FeignClient(name = "reservaHosepdaje", url="localhost:8082")
public interface OpenFeignClient {
	
	@GetMapping("/api/hospedaje/listar")
	public List<ReservaDTO> listarReservas();

}
