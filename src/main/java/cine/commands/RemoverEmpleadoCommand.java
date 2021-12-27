package cine.commands;

import cine.values.IdCine;
import cine.values.IdEmpleado;
import co.com.sofka.domain.generic.Command;

public class RemoverEmpleadoCommand extends Command {
    private final IdCine idCine;
    private final IdEmpleado idEmpleado;

    public RemoverEmpleadoCommand(IdCine idCine, IdEmpleado idEmpleado) {
        this.idCine = idCine;
        this.idEmpleado = idEmpleado;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }
}
