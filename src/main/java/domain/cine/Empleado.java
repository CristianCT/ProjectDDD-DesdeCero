package domain.cine;

import domain.cine.values.*;
import co.com.sofka.domain.generic.Entity;
import domain.genericos.Apellidos;
import domain.genericos.FechaNacimiento;
import domain.genericos.Nombre;
import domain.genericos.Telefono;

import java.util.Objects;

public class Empleado extends Entity<IdEmpleado> {

    private final Nombre nombre;
    private final Apellidos apellidos;
    private Cargo cargo;
    private final FechaNacimiento fechaNacimiento;
    private Telefono telefono;

    public Empleado(IdEmpleado entityId, Nombre nombre, Apellidos apellidos, Cargo cargo, FechaNacimiento fechaNacimiento, Telefono telefono) {
        super(entityId);
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        this.apellidos = Objects.requireNonNull(apellidos, "Los apellidos no pueden ser null");
        this.cargo = Objects.requireNonNull(cargo, "El cargo no puede ser null");
        this.fechaNacimiento = Objects.requireNonNull(fechaNacimiento, "La fecha de nacimiento no puede ser null");
        this.telefono = Objects.requireNonNull(telefono, "El telefono no puede ser null");
    }

    public void cambiarCargo(Cargo cargo){
        this.cargo = Objects.requireNonNull(cargo, "El cargo no puede ser null");
    }

    public void cambiarNumeroTelefonico(Telefono telefono){
        this.telefono = Objects.requireNonNull(telefono, "El telefono no puede ser null");
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
