package domain.cine.commands;

import domain.cine.values.Dia;
import domain.cine.values.FechaFin;
import domain.cine.values.FechaInicio;
import domain.cine.values.IdCine;
import co.com.sofka.domain.generic.Command;

import java.util.Set;

public class CambiarHorarioCommand extends Command {
    private final IdCine idCine;
    private final FechaInicio fechaInicio;
    private final FechaFin fechaFin;
    private final Set<Dia> dias;

    public CambiarHorarioCommand(IdCine idCine, FechaInicio fechaInicio, FechaFin fechaFin, Set<Dia> dias) {
        this.idCine = idCine;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dias = dias;
    }

    public IdCine getIdCine() {
        return idCine;
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
