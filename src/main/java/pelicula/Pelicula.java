package pelicula;

import co.com.sofka.domain.generic.AggregateEvent;
import pelicula.values.*;

import java.util.HashSet;
import java.util.Set;

public class Pelicula extends AggregateEvent<IdPelicula> {

    private final Titulo titulo;
    private final Duracion duracion;
    private Categoria categoria;
    private Set<Funcion> funcion;

    public Pelicula(IdPelicula entityId, Titulo titulo, Duracion duracion, Categoria categoria) {
        super(entityId);
        this.titulo = titulo;
        this.duracion = duracion;
        this.categoria = categoria;
        this.funcion = new HashSet<>();
    }


    public void agregarFuncion(){

    }

    public void cambiarUnidadMedidaDuracion(){

    }

    public void cambiarFechaFuncion(){

    }

    public void cambiarPrecioBaseFuncion(){

    }

    public void asociarPagoBoleta(){

    }

    public void cambiarAsientoBoleta(){

    }

    public void cambiarPagoAPagado(){

    }

    public Titulo titulo() {
        return titulo;
    }

    public Duracion duracion() {
        return duracion;
    }

    public Categoria categoria() {
        return categoria;
    }

    public Set<Funcion> funcion() {
        return funcion;
    }
}
