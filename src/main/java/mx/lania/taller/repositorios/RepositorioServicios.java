package mx.lania.taller.repositorios;

import mx.lania.taller.entidades.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioServicios extends JpaRepository<Servicio,Integer> {
}
