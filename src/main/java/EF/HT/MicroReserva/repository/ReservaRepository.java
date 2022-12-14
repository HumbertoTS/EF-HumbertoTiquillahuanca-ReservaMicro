package EF.HT.MicroReserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EF.HT.MicroReserva.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
