package pelicula.events;

import cine.values.IdAsiento;
import co.com.sofka.domain.generic.DomainEvent;
import pelicula.values.IdBoleta;
import pelicula.values.IdFuncion;

public class AsientoBoletaCambiado extends DomainEvent {
    private final IdFuncion idFuncion;
    private final IdBoleta idBoleta;
    private final IdAsiento idAsiento;
    public AsientoBoletaCambiado(IdFuncion idFuncion, IdBoleta idBoleta, IdAsiento idAsiento) {
        super("sofkau.pelicula.asientoboletacabiado");
        this.idFuncion = idFuncion;
        this.idBoleta = idBoleta;
        this.idAsiento = idAsiento;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public IdBoleta getIdBoleta() {
        return idBoleta;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }
}
