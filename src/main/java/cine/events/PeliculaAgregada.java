package cine.events;

import co.com.sofka.domain.generic.DomainEvent;
import pelicula.values.IdPelicula;

public class PeliculaAgregada extends DomainEvent {

    private final IdPelicula idPelicula;

    public PeliculaAgregada(IdPelicula idPelicula) {
        super("sofkau.cine.peliculaagregada");
        this.idPelicula = idPelicula;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }
}
