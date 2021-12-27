package domain.pelicula.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Fecha;
import domain.pelicula.values.IdFuncion;

public class FechaFuncionCambiada extends DomainEvent {
    private final IdFuncion idFuncion;
    private final Fecha fecha;

    public FechaFuncionCambiada(IdFuncion idFuncion, Fecha fecha) {
        super("sofkau.domain.pelicula.fechafuncioncambiada");
        this.idFuncion = idFuncion;
        this.fecha = fecha;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
