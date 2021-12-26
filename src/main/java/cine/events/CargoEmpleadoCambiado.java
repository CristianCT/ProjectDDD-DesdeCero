package cine.events;

import cine.values.Cargo;
import cine.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;

public class CargoEmpleadoCambiado extends DomainEvent {
    private final IdEmpleado idEmpleado;
    private final Cargo cargo;

    public CargoEmpleadoCambiado(IdEmpleado idEmpleado, Cargo cargo) {
        super("sofkau.cine.cargoempleadocambiado");
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
