package domain.cliente.events;

import domain.cliente.values.Detalles;
import domain.cliente.values.IdVisita;
import co.com.sofka.domain.generic.DomainEvent;
import domain.genericos.Fecha;

public class VisitaAgregada extends DomainEvent {

    private final IdVisita idVisita;
    private final Detalles detalles;
    private final Fecha fecha;

    public VisitaAgregada(IdVisita idVisita, Detalles detalles, Fecha fecha) {
        super("sofkau.domain.cliente.visitaagregada");
        this.idVisita = idVisita;
        this.detalles = detalles;
        this.fecha = fecha;
    }

    public IdVisita getIdVisita() {
        return idVisita;
    }

    public Detalles getDetalles() {
        return detalles;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
