package domain.pelicula.commands;

import co.com.sofka.domain.generic.Command;
import domain.genericos.Fecha;
import domain.pelicula.values.IdFuncion;
import domain.pelicula.values.IdPelicula;

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
