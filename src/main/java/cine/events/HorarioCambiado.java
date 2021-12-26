package cine.events;

import cine.values.Dia;
import cine.values.FechaFin;
import cine.values.FechaInicio;
import co.com.sofka.domain.generic.DomainEvent;
import genericos.Fecha;

import java.util.Set;

public class HorarioCambiado extends DomainEvent {
    private final FechaInicio fechaInicio;
    private final FechaFin fechaFin;
    private final Set<Dia> dias;
    public HorarioCambiado(FechaInicio fechaInicio, FechaFin fechaFin, Set<Dia> dias) {
        super("sofkau.cine.horariocambiado");
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
