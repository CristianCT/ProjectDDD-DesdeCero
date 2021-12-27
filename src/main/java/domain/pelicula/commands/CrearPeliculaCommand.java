package domain.pelicula.commands;

import co.com.sofka.domain.generic.Command;
import domain.pelicula.values.Categoria;
import domain.pelicula.values.Duracion;
import domain.pelicula.values.IdPelicula;
import domain.pelicula.values.Titulo;

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
