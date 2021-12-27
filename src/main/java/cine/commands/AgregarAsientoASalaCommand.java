package cine.commands;

import cine.Asiento;
import cine.values.IdCine;
import cine.values.IdSala;
import co.com.sofka.domain.generic.Command;

public class AgregarAsientoASalaCommand extends Command {
    private final IdCine idCine;
    private final IdSala idSala;
    private final Asiento asiento;

    public AgregarAsientoASalaCommand(IdCine idCine, IdSala idSala, Asiento asiento) {
        this.idCine = idCine;
        this.idSala = idSala;
        this.asiento = asiento;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public IdSala getIdSala() {
        return idSala;
    }

    public Asiento getAsiento() {
        return asiento;
    }
}
