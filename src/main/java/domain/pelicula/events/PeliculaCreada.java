package domain.pelicula.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.pelicula.values.Categoria;
import domain.pelicula.values.Duracion;
import domain.pelicula.values.Titulo;

public class PeliculaCreada extends DomainEvent {
    private final Titulo titulo;
    private final Duracion duracion;
    private final Categoria categoria;

    public PeliculaCreada(Titulo titulo, Duracion duracion, Categoria categoria) {
        super("sofkau.domain.pelicula.peliculacreada");
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
