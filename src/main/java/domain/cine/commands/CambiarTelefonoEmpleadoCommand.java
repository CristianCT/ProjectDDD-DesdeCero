package domain.cine.commands;

import domain.cine.values.IdCine;
import domain.cine.values.IdEmpleado;
import co.com.sofka.domain.generic.Command;
import domain.genericos.Telefono;

public class CambiarTelefonoEmpleadoCommand extends Command {
    private final IdCine idCine;
    private final IdEmpleado idEmpleado;
    private final Telefono telefono;

    public CambiarTelefonoEmpleadoCommand(IdCine idCine, IdEmpleado idEmpleado, Telefono telefono) {
        this.idCine = idCine;
        this.idEmpleado = idEmpleado;
        this.telefono = telefono;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
