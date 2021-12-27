package domain.cine.events;

import domain.cine.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoRemovido extends DomainEvent {

    private final IdEmpleado idEmpleado;
    public EmpleadoRemovido(IdEmpleado idEmpleado) {
        super("sofkau.domain.cine.removerempleado");
        this.idEmpleado = idEmpleado;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }
}
