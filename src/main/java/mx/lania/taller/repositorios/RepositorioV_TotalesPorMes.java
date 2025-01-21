package mx.lania.taller.repositorios;

import mx.lania.taller.entidades.V_TotalPorMes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface RepositorioV_TotalesPorMes
        extends JpaRepository<V_TotalPorMes, LocalDate> {
}
