package cliente.events;

import cliente.values.Detalles;
import cliente.values.IdVisita;
import co.com.sofka.domain.generic.DomainEvent;
import genericos.Fecha;

public class VisitaAgregada extends DomainEvent {

    private final IdVisita idVisita;
    private final Detalles detalles;
    private final Fecha fecha;

    public VisitaAgregada(IdVisita idVisita, Detalles detalles, Fecha fecha) {
        super("sofkau.cliente.visitaagregada");
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
