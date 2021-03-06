package domain.cine.events;

import domain.cine.values.Horario;
import domain.cine.values.Ubicacion;
import co.com.sofka.domain.generic.DomainEvent;

public class CineCreado extends DomainEvent {
    private final Ubicacion ubicacion;
    private final Horario horario;

    public CineCreado(Ubicacion ubicacion, Horario horario) {
        super("sofkau.domain.cine.cinecreado");
        this.ubicacion = ubicacion;
        this.horario = horario;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Horario getHorario() {
        return horario;
    }
}
