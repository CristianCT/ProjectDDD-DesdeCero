package domain.cine.events;

import domain.cine.values.Cargo;
import domain.cine.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Apellidos;
import domain.genericos.FechaNacimiento;
import domain.genericos.Nombre;
import domain.genericos.Telefono;

public class EmpleadoAgregado extends DomainEvent {
    private final IdEmpleado idEmpleado;
    private final Nombre nombre;
    private final Apellidos apellidos;
    private final Cargo cargo;
    private final FechaNacimiento fechaNacimiento;
    private final Telefono telefono;

    public EmpleadoAgregado(IdEmpleado idEmpleado, Nombre nombre, Apellidos apellidos, Cargo cargo, FechaNacimiento fechaNacimiento, Telefono telefono) {
        super("sofkau.domain.cine.agregarempleado");
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Apellidos getApellidos() {
        return apellidos;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public FechaNacimiento getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
