package cine.events;

import cine.values.IdAsiento;
import cine.values.IdSala;
import cine.values.TipoAsiento;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoAsientoEnSalaCambiado extends DomainEvent {
    private final IdSala idSala;
    private final IdAsiento idAsiento;
    private final TipoAsiento tipoAsiento;

    public TipoAsientoEnSalaCambiado(IdSala idSala, IdAsiento idAsiento, TipoAsiento tipoAsiento) {
        super("sofkau.cine.tipoasientoensalacambiado");
        this.idSala = idSala;
        this.idAsiento = idAsiento;
        this.tipoAsiento = tipoAsiento;
    }

    public IdSala getIdSala() {
        return idSala;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }
}
