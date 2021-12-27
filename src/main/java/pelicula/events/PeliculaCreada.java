package pelicula.events;

import co.com.sofka.domain.generic.DomainEvent;
import pelicula.values.Categoria;
import pelicula.values.Duracion;
import pelicula.values.Titulo;

public class PeliculaCreada extends DomainEvent {
    private final Titulo titulo;
    private final Duracion duracion;
    private final Categoria categoria;

    public PeliculaCreada(Titulo titulo, Duracion duracion, Categoria categoria) {
        super("sofkau.pelicula.peliculacreada");
        this.titulo = titulo;
        this.duracion = duracion;
        this.categoria = categoria;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
