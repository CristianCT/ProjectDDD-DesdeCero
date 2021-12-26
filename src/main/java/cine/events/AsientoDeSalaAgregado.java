package cine.events;

import cine.Asiento;
import cine.values.IdSala;
import co.com.sofka.domain.generic.DomainEvent;

public class AsientoDeSalaAgregado extends DomainEvent {
    private final IdSala idSala;
    private final Asiento asiento;

    public AsientoDeSalaAgregado(IdSala idSala, Asiento asiento) {
        super("sofkau.cine.asientodesalaagregado");
        this.idSala = idSala;
        this.asiento = asiento;
    }

    public IdSala getIdSala() {
        return idSala;
    }

    public Asiento getAsiento() {
        return asiento;
    }
}
