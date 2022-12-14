package EF.HT.MicroReserva.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import EF.HT.MicroReserva.model.Reservadetalle;

public interface DetalleReservaRepository extends JpaRepository<Reservadetalle, Integer> {

}
