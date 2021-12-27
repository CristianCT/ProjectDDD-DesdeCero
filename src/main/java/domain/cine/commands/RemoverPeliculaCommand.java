package domain.cine.commands;

import domain.cine.values.IdCine;
import co.com.sofka.domain.generic.Command;
import domain.pelicula.values.IdPelicula;

public class RemoverPeliculaCommand extends Command {
    private final IdCine idcine;
    private final IdPelicula idPelicula;

    public RemoverPeliculaCommand(IdCine idcine, IdPelicula idPelicula) {
        this.idcine = idcine;
        this.idPelicula = idPelicula;
    }

    public IdCine getIdcine() {
        return idcine;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }
}
