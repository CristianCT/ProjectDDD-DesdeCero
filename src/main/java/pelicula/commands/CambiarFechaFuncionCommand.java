package pelicula.commands;

import co.com.sofka.domain.generic.Command;
import genericos.Fecha;
import pelicula.values.IdFuncion;
import pelicula.values.IdPelicula;

public class CambiarFechaFuncionCommand extends Command {

    private final IdPelicula idPelicula;
    private final IdFuncion idFuncion;
    private final Fecha fecha;

    public CambiarFechaFuncionCommand(IdPelicula idPelicula, IdFuncion idFuncion, Fecha fecha) {
        this.idPelicula = idPelicula;
        this.idFuncion = idFuncion;
        this.fecha = fecha;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
