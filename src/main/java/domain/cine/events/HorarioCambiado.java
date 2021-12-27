package domain.cine.events;

import domain.cine.values.Dia;
import domain.cine.values.FechaFin;
import domain.cine.values.FechaInicio;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class HorarioCambiado extends DomainEvent {
    private final FechaInicio fechaInicio;
    private final FechaFin fechaFin;
    private final Set<Dia> dias;
    public HorarioCambiado(FechaInicio fechaInicio, FechaFin fechaFin, Set<Dia> dias) {
        super("sofkau.domain.cine.horariocambiado");
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dias = dias;
    }

    public FechaInicio getFechaInicio() {
        return fechaInicio;
    }

    public FechaFin getFechaFin() {
        return fechaFin;
    }

    public Set<Dia> getDias() {
        return dias;
    }
}
