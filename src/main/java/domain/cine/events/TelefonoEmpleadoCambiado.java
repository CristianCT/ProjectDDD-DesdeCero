package domain.cine.events;

import domain.cine.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Telefono;

public class TelefonoEmpleadoCambiado extends DomainEvent {
    private final IdEmpleado idEmpleado;
    private final Telefono telefono;

    public TelefonoEmpleadoCambiado(IdEmpleado idEmpleado, Telefono telefono) {
        super("sofkau.domain.cine.telefonoempleadocambiado");
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
