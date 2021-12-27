package domain.cine.commands;

import domain.cine.values.IdAsiento;
import domain.cine.values.IdCine;
import domain.cine.values.IdSala;
import domain.cine.values.TipoAsiento;
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
