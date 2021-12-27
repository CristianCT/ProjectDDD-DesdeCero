package cine.commands;

import cine.values.IdAsiento;
import cine.values.IdCine;
import cine.values.IdSala;
import cine.values.TipoAsiento;
import co.com.sofka.domain.generic.Command;

public class CambiarTipoAsientoEnSalaCommand extends Command {
    private final IdCine idCine;
    private final IdSala idSala;
    private final IdAsiento idAsiento;
    private final TipoAsiento tipoAsiento;

    public CambiarTipoAsientoEnSalaCommand(IdCine idCine, IdSala idSala, IdAsiento idAsiento, TipoAsiento tipoAsiento) {
        this.idCine = idCine;
        this.idSala = idSala;
        this.idAsiento = idAsiento;
        this.tipoAsiento = tipoAsiento;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public IdSala getIdSala() {
        return idSala;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }
}
