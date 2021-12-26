package cine.events;

import cine.values.IdSala;
import cine.values.TipoProyeccion;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoProyeccionDeSalaCambiado extends DomainEvent {
    private final IdSala idSala;
    private final TipoProyeccion tipoProyeccion;
    public TipoProyeccionDeSalaCambiado(IdSala idSala, TipoProyeccion tipoProyeccion) {
        super("sofkau.cine.tipoproyecciondelasalacambiado");
        this.idSala = idSala;
        this.tipoProyeccion = tipoProyeccion;
    }

    public IdSala getIdSala() {
        return idSala;
    }

    public TipoProyeccion getTipoProyeccion() {
        return tipoProyeccion;
    }
}
