package cine.events;

import cine.values.Cargo;
import cine.values.IdEmpleado;
import co.com.sofka.domain.generic.DomainEvent;
import genericos.Apellidos;
import genericos.FechaNacimiento;
import genericos.Nombre;
import genericos.Telefono;

public class EmpleadoAgregado extends DomainEvent {
    private final IdEmpleado idEmpleado;
    private final Nombre nombre;
    private final Apellidos apellidos;
    private final Cargo cargo;
    private final FechaNacimiento fechaNacimiento;
    private final Telefono telefono;

    public EmpleadoAgregado(IdEmpleado idEmpleado, Nombre nombre, Apellidos apellidos, Cargo cargo, FechaNacimiento fechaNacimiento, Telefono telefono) {
        super("sofkau.cine.agregarempleado");
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
