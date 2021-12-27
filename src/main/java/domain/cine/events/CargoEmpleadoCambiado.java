package domain.cine.events;

import domain.cine.values.Cargo;
import domain.cine.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;

public class CargoEmpleadoCambiado extends DomainEvent {
    private final IdEmpleado idEmpleado;
    private final Cargo cargo;

    public CargoEmpleadoCambiado(IdEmpleado idEmpleado, Cargo cargo) {
        super("sofkau.domain.cine.cargoempleadocambiado");
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
