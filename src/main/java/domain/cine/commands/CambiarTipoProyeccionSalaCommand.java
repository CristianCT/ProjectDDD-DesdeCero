package domain.cine.commands;

import domain.cine.values.IdCine;
import domain.cine.values.IdSala;
import domain.cine.values.TipoProyeccion;
import co.com.sofka.domain.generic.Command;

public class CambiarTipoProyeccionSalaCommand extends Command {
    private final IdCine idCine;
    private final IdSala idSala;
    private final TipoProyeccion tipoProyeccion;

    public CambiarTipoProyeccionSalaCommand(IdCine idCine, IdSala idSala, TipoProyeccion tipoProyeccion) {
        this.idCine = idCine;
        this.idSala = idSala;
        this.tipoProyeccion = tipoProyeccion;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public IdSala getIdSala() {
        return idSala;
    }

    public TipoProyeccion getTipoProyeccion() {
        return tipoProyeccion;
    }
}
