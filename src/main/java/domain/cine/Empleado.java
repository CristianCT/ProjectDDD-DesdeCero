package domain.cine;

import domain.cine.values.*;
import co.com.sofka.domain.generic.Entity;
import domain.genericos.Apellidos;
import domain.genericos.FechaNacimiento;
import domain.genericos.Nombre;
import domain.genericos.Telefono;

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

    public void cambiarCargo(Cargo cargo){
        this.cargo = cargo;
    }

    public void cambiarNumeroTelefonico(Telefono telefono){
        this.telefono = telefono;
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
