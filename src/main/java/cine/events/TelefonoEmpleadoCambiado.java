package cine.events;

import cine.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;
import genericos.Telefono;

public class TelefonoEmpleadoCambiado extends DomainEvent {
    private final IdEmpleado idEmpleado;
    private final Telefono telefono;

    public TelefonoEmpleadoCambiado(IdEmpleado idEmpleado, Telefono telefono) {
        super("sofkau.cine.telefonoempleadocambiado");
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
