package pelicula.commands;

import co.com.sofka.domain.generic.Command;
import genericos.Fecha;
import genericos.PrecioBase;
import pelicula.values.IdPelicula;

public class AgregarFuncionCommand extends Command {
    private final IdPelicula idPelicula;
    private final PrecioBase precioBase;
    private final Fecha fecha;

    public AgregarFuncionCommand(IdPelicula idPelicula, PrecioBase precioBase, Fecha fecha) {
        this.idPelicula = idPelicula;
        this.precioBase = precioBase;
        this.fecha = fecha;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }

    public PrecioBase getPrecioBase() {
        return precioBase;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
