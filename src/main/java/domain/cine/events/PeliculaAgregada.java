package domain.cine.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.pelicula.values.IdPelicula;

public class PeliculaAgregada extends DomainEvent {

    private final IdPelicula idPelicula;

    public PeliculaAgregada(IdPelicula idPelicula) {
        super("sofkau.domain.cine.peliculaagregada");
        this.idPelicula = idPelicula;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }
}
