package cine;

import cine.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import pelicula.values.IdPelicula;

import java.util.HashSet;
import java.util.Set;

public class Cine extends AggregateEvent<IdCine> {

    private final Ubicacion ubicacion;
    private Horario horario;
    private Set<IdPelicula> cartelera;
    private Set<Empleado> empleados;
    private Set<Sala> salas;

    public Cine(IdCine entityId, Ubicacion ubicacion, Horario horario) {
        super(entityId);
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.cartelera = new HashSet<>();
        this.empleados = new HashSet<>();
        this.salas = new HashSet<>();
    }

    public void remplazarHorario(){

    }

    public void agregarEmpleado(){

    }

    public void agregarAsientoASala(){

    }

    public void cambiarTipoProyeccionDeSala(){

    }

    public void remplazarAsientoEnSala(){

    }

    public void cambiarTipoAsientoEnSala(){

    }

    public void cambiarCargoEmpleado(){

    }

    public void cambiarNumeroTelefonoEmpleado(){

    }
}
