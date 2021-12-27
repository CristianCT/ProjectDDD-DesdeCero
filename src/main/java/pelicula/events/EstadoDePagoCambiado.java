package pelicula.events;

import co.com.sofka.domain.generic.DomainEvent;
import pelicula.values.IdBoleta;
import pelicula.values.IdFuncion;
import pelicula.values.Pagado;

public class EstadoDePagoCambiado extends DomainEvent {
    private final IdFuncion idFuncion;
    private final IdBoleta idBoleta;
    private final Pagado pagado;
    public EstadoDePagoCambiado(IdFuncion idFuncion, IdBoleta idBoleta, Pagado pagado) {
        super("sofkau.pelicula.pagomarcadocomopagado");
        this.idFuncion = idFuncion;
        this.idBoleta = idBoleta;
        this.pagado = pagado;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public IdBoleta getIdBoleta() {
        return idBoleta;
    }

    public Pagado getPagado() {
        return pagado;
    }
}
