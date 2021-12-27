package pelicula.commands;

import co.com.sofka.domain.generic.Command;
import pelicula.values.Categoria;
import pelicula.values.Duracion;
import pelicula.values.IdPelicula;
import pelicula.values.Titulo;

public class CrearPeliculaCommand extends Command {
    private final IdPelicula idPelicula;
    private final Titulo titulo;
    private final Duracion duracion;
    private final Categoria categoria;

    public CrearPeliculaCommand(IdPelicula idPelicula, Titulo titulo, Duracion duracion, Categoria categoria) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.duracion = duracion;
        this.categoria = categoria;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
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
