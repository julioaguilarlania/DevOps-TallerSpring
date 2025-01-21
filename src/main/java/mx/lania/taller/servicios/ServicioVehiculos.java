package mx.lania.taller.servicios;

import mx.lania.taller.entidades.Cliente;
import mx.lania.taller.entidades.Vehiculo;
import mx.lania.taller.repositorios.RepositorioClientes;
import mx.lania.taller.repositorios.RepositorioVehiculos;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

//@Service
@Component
public class ServicioVehiculos {

    RepositorioVehiculos repoVehiculos;
    RepositorioClientes repoClientes;

    public ServicioVehiculos(RepositorioVehiculos repoVehiculos,
                             RepositorioClientes repoClientes) {
        this.repoVehiculos = repoVehiculos;
        this.repoClientes = repoClientes;
    }

    @Transactional
    public Vehiculo guardarNuevo(Vehiculo v) {
        Cliente cl = v.getCliente();
        if (cl != null && cl.getClienteId() != null) {
            Optional<Cliente> opCl = repoClientes.findById(cl.getClienteId());
            if (opCl.isPresent()) {
                // Cliente existe, solo guardamos Vehiculo
                v = repoVehiculos.save(v);
                return v;
            }
        }
        cl.setClienteId(null);
        cl = repoClientes.save(cl);
        v.setCliente(cl);
        return repoVehiculos.save(v);
    }
}
