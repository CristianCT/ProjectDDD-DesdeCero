package cine.commands;

import cine.values.Cargo;
import cine.values.IdCine;
import co.com.sofka.domain.generic.Command;
import genericos.Apellidos;
import genericos.FechaNacimiento;
import genericos.Nombre;
import genericos.Telefono;

public class AgregarEmpleadoCommand extends Command {
    private final IdCine idCine;
    private final Nombre nombre;
    private final Apellidos apellidos;
    private final Cargo cargo;
    private final FechaNacimiento fechaNacimiento;
    private final Telefono telefono;

    public AgregarEmpleadoCommand(IdCine idCine, Nombre nombre, Apellidos apellidos, Cargo cargo, FechaNacimiento fechaNacimiento, Telefono telefono) {
        this.idCine = idCine;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public IdCine getIdCine() {
        return idCine;
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
