package domain.pelicula.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Fecha;
import domain.genericos.PrecioBase;
import domain.pelicula.values.IdFuncion;

public class FuncionAgregada extends DomainEvent {
    private final IdFuncion idFuncion;
    private final PrecioBase precioBase;
    private final Fecha fecha;

    public FuncionAgregada(IdFuncion idFuncion, PrecioBase precioBase, Fecha fecha) {
        super("sofkau.domain.pelicula.funcionagregada");
        this.idFuncion = idFuncion;
        this.precioBase = precioBase;
        this.fecha = fecha;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public PrecioBase getPrecioBase() {
        return precioBase;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
