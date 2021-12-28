package domain.pelicula;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cine.values.IdAsiento;
import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.AggregateEvent;
import domain.genericos.Fecha;
import domain.genericos.PrecioBase;
import domain.pelicula.events.*;
import domain.pelicula.values.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pelicula extends AggregateEvent<IdPelicula> {

    protected Titulo titulo;
    protected Duracion duracion;
    protected Categoria categoria;
    protected Set<Funcion> funciones;

    public Pelicula(IdPelicula entityId, Titulo titulo, Duracion duracion, Categoria categoria) {
        super(entityId);
        subscribe(new PeliculaChange(this));
        appendChange(new PeliculaCreada(titulo, duracion, categoria)).apply();
        this.titulo = titulo;
        this.duracion = duracion;
        this.categoria = categoria;
        this.funciones = new HashSet<>();
    }

    private Pelicula(IdPelicula idPelicula){
        super(idPelicula);
        subscribe(new PeliculaChange(this));
    }

    public static Pelicula from(IdPelicula idPelicula, List<DomainEvent> retrieveEvents) {
        var pelicula = new Pelicula(idPelicula);
        retrieveEvents.forEach(pelicula::applyEvent);
        return pelicula;
    }


    public void agregarFuncion(PrecioBase precioBase, Fecha fecha){
        appendChange(new FuncionAgregada(new IdFuncion(), precioBase, fecha)).apply();
    }

    public void cambiarFechaFuncion(IdFuncion idFuncion, Fecha fecha){
        appendChange(new FechaFuncionCambiada(idFuncion, fecha)).apply();
    }

    public void cambiarPrecioBaseFuncion(IdFuncion idFuncion, PrecioBase precioBase){
        appendChange(new PrecioBaseFuncionCambiado(idFuncion, precioBase)).apply();
    }

    public void agregarBoletaFuncion(IdFuncion idFuncion, IdAsiento idAsiento, IdCliente idCliente, Tipo tipo, Precio precio, Pago pago){
        appendChange(
            new BoletaAgregadaAFuncion(
                idFuncion,
                new IdBoleta(),
                idAsiento,
                idCliente,
                tipo,
                precio,
                pago
            )
        ).apply();
    }

    public void cambiarAsientoBoleta(IdFuncion idFuncion, IdBoleta idBoleta, IdAsiento idAsiento){
        appendChange(new AsientoBoletaCambiado(idFuncion, idBoleta, idAsiento)).apply();
    }

    public void marcarPagoComoPagado(IdFuncion idFuncion, IdBoleta idBoleta, Pagado pagado){
        appendChange(new EstadoDePagoCambiado(idFuncion, idBoleta, pagado)).apply();
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

    public Set<Funcion> funciones() {
        return funciones;
    }
}
