package cine;

import cine.values.*;
import co.com.sofka.domain.generic.Entity;
import genericos.Apellidos;
import genericos.FechaNacimiento;
import genericos.Nombre;
import genericos.Telefono;

public class Empleado extends Entity<IdEmpleado> {

    private final Nombre nombre;
    private final Apellidos apellidos;
    private Cargo cargo;
    private final FechaNacimiento fechaNacimiento;
    private Telefono telefono;

    public Empleado(IdEmpleado entityId, Nombre nombre, Apellidos apellidos, Cargo cargo, FechaNacimiento fechaNacimiento, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public void cambiarCargo(){

    }

    public void cambiarNumeroTelefonico(){

    }

    public Nombre nombre() {
        return nombre;
    }

    public Apellidos apellidos() {
        return apellidos;
    }

    public Cargo cargo() {
        return cargo;
    }

    public FechaNacimiento fechaNacimiento() {
        return fechaNacimiento;
    }

    public Telefono telefono() {
        return telefono;
    }
}
