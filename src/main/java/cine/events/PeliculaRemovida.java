package cine.events;

import co.com.sofka.domain.generic.DomainEvent;
import pelicula.values.IdPelicula;

public class PeliculaRemovida extends DomainEvent {
    private final IdPelicula idPelicula;
    public PeliculaRemovida(IdPelicula idPelicula) {
        super("sofkau.cine.pelicularemovida");
        this.idPelicula = idPelicula;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }
}
