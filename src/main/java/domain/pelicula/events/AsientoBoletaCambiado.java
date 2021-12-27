package domain.pelicula.events;

import domain.cine.values.IdAsiento;
import co.com.sofka.domain.generic.DomainEvent;
import domain.pelicula.values.IdBoleta;
import domain.pelicula.values.IdFuncion;

public class AsientoBoletaCambiado extends DomainEvent {
    private final IdFuncion idFuncion;
    private final IdBoleta idBoleta;
    private final IdAsiento idAsiento;
    public AsientoBoletaCambiado(IdFuncion idFuncion, IdBoleta idBoleta, IdAsiento idAsiento) {
        super("sofkau.domain.pelicula.asientoboletacabiado");
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
