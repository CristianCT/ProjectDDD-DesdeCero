package cine.commands;

import cine.values.*;
import co.com.sofka.domain.generic.Command;

public class CrearCineCommand extends Command {
    private final IdCine idCine;
    private final Ubicacion ubicacion;
    private final Horario horario;

    public CrearCineCommand(IdCine idCine, Ubicacion ubicacion, Horario horario) {
        this.idCine = idCine;
        this.ubicacion = ubicacion;
        this.horario = horario;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Horario getHorario() {
        return horario;
    }
}
