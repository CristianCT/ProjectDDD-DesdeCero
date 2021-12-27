package domain.pelicula.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.PrecioBase;
import domain.pelicula.values.IdFuncion;

public class PrecioBaseFuncionCambiado extends DomainEvent {
    private final IdFuncion idFuncion;
    private final PrecioBase precioBase;
    public PrecioBaseFuncionCambiado(IdFuncion idFuncion, PrecioBase precioBase) {
        super("sofkau.domain.pelicula.preciobasefuncioncambiado");
        this.idFuncion = idFuncion;
        this.precioBase = precioBase;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public PrecioBase getPrecioBase() {
        return precioBase;
    }
}
