package mx.lania.taller.entidades;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="totales_por_mes")
public class V_TotalPorMes {
    @Id
    @Column(name="fecha_salida")
    private LocalDate fechaSalida;

    @Basic
    private Integer total;

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
