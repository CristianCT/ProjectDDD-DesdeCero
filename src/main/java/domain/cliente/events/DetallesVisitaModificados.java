package domain.cliente.events;

import domain.cliente.values.Detalles;
import domain.cliente.values.IdVisita;
import co.com.sofka.domain.generic.DomainEvent;

public class DetallesVisitaModificados extends DomainEvent {
    private final IdVisita idVisita;
    private final Detalles detalles;

    public DetallesVisitaModificados(IdVisita idVisita, Detalles detalles) {
        super("sofkau.domain.cliente.detallesvisitamodificados");
        this.idVisita = idVisita;
        this.detalles = detalles;
    }

    public IdVisita getIdVisita() {
        return idVisita;
    }

    public Detalles getDetalles() {
        return detalles;
    }
}
