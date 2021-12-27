package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Apellidos;
import domain.genericos.FechaNacimiento;
import domain.genericos.Nombre;
import domain.genericos.Telefono;

public class ClienteCreado extends DomainEvent {
    private final Nombre nombre;
    private final Apellidos apellidos;
    private final FechaNacimiento fechaNacimiento;
    private final Telefono telefono;

    public ClienteCreado(Nombre nombre, Apellidos apellidos, FechaNacimiento fechaNacimiento, Telefono telefono) {
        super("sofkau.domain.cliente.clientecreado");
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Apellidos getApellidos() {
        return apellidos;
    }

    public FechaNacimiento getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
