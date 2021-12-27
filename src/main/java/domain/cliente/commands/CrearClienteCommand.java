package domain.cliente.commands;

import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.Command;
import domain.genericos.Apellidos;
import domain.genericos.FechaNacimiento;
import domain.genericos.Nombre;
import domain.genericos.Telefono;

public class CrearClienteCommand extends Command {
    private final IdCliente idCliente;
    private final Nombre nombre;
    private final Apellidos apellidos;
    private final FechaNacimiento fechaNacimiento;
    private final Telefono telefono;

    public CrearClienteCommand(IdCliente idCliente, Nombre nombre, Apellidos apellidos, FechaNacimiento fechaNacimiento, Telefono telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public IdCliente getIdCliente() {
        return idCliente;
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
