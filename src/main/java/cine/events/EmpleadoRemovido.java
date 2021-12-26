package cine.events;

import cine.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoRemovido extends DomainEvent {

    private final IdEmpleado idEmpleado;
    public EmpleadoRemovido(IdEmpleado idEmpleado) {
        super("sofkau.cine.removerempleado");
        this.idEmpleado = idEmpleado;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }
}
