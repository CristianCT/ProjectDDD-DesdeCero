package cine.events;

import cine.values.IdSala;
import cine.values.Numeral;
import cine.values.TipoProyeccion;
import co.com.sofka.domain.generic.DomainEvent;

public class SalaAgregada extends DomainEvent {
    private final IdSala idSala;
    private final Numeral numeral;
    private final TipoProyeccion tipoProyeccion;

    public SalaAgregada(IdSala idSala, Numeral numeral, TipoProyeccion tipoProyeccion) {
        super("sofkau.cine.salaagregada");
        this.idSala = idSala;
        this.numeral = numeral;
        this.tipoProyeccion = tipoProyeccion;
    }

    public IdSala getIdSala() {
        return idSala;
    }

    public Numeral getNumeral() {
        return numeral;
    }

    public TipoProyeccion getTipoProyeccion() {
        return tipoProyeccion;
    }
}
