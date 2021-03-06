package domain.cine.commands;

import domain.cine.values.IdCine;
import co.com.sofka.domain.generic.Command;
import domain.pelicula.values.IdPelicula;

public class AgregarPeliculaCommand extends Command {
    private final IdCine idCine;
    private final IdPelicula idPelicula;


    public AgregarPeliculaCommand(IdCine idCine, IdPelicula idPelicula) {
        this.idCine = idCine;
        this.idPelicula = idPelicula;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }
}
