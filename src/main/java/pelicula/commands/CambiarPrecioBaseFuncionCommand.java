package pelicula.commands;

import co.com.sofka.domain.generic.Command;
import genericos.PrecioBase;
import pelicula.values.IdFuncion;
import pelicula.values.IdPelicula;

public class CambiarPrecioBaseFuncionCommand extends Command {
    private final IdPelicula idPelicula;
    private final IdFuncion idFuncion;
    private final PrecioBase precioBase;

    public CambiarPrecioBaseFuncionCommand(IdPelicula idPelicula, IdFuncion idFuncion, PrecioBase precioBase) {
        this.idPelicula = idPelicula;
        this.idFuncion = idFuncion;
        this.precioBase = precioBase;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public PrecioBase getPrecioBase() {
        return precioBase;
    }
}
