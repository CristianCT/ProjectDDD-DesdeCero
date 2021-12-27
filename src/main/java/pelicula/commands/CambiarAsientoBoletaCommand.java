package pelicula.commands;

import cine.values.IdAsiento;
import co.com.sofka.domain.generic.Command;
import pelicula.values.IdBoleta;
import pelicula.values.IdFuncion;
import pelicula.values.IdPelicula;

public class CambiarAsientoBoletaCommand extends Command {
    private final IdPelicula idPelicula;
    private final IdFuncion idFuncion;
    private final IdBoleta idBoleta;
    private final IdAsiento idAsiento;

    public CambiarAsientoBoletaCommand(IdPelicula idPelicula, IdFuncion idFuncion, IdBoleta idBoleta, IdAsiento idAsiento) {
        this.idPelicula = idPelicula;
        this.idFuncion = idFuncion;
        this.idBoleta = idBoleta;
        this.idAsiento = idAsiento;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public IdBoleta getIdBoleta() {
        return idBoleta;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
