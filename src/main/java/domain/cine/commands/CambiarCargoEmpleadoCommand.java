package domain.cine.commands;

import domain.cine.values.Cargo;
import domain.cine.values.IdCine;
import domain.cine.values.IdEmpleado;
import co.com.sofka.domain.generic.Command;

public class CambiarCargoEmpleadoCommand extends Command {
    private final IdCine idCine;
    private final IdEmpleado idEmpleado;
    private final Cargo cargo;

    public CambiarCargoEmpleadoCommand(IdCine idCine, IdEmpleado idEmpleado, Cargo cargo) {
        this.idCine = idCine;
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public IdEmpleado getIdEmpleado() {
        return idEmpleado;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
