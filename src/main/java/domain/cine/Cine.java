package domain.cine;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cine.events.*;
import domain.cine.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import domain.genericos.Apellidos;
import domain.genericos.FechaNacimiento;
import domain.genericos.Nombre;
import domain.genericos.Telefono;
import domain.pelicula.values.IdPelicula;

import java.util.List;
import java.util.Set;

public class Cine extends AggregateEvent<IdCine> {

    protected Ubicacion ubicacion;
    protected Horario horario;
    protected Set<IdPelicula> cartelera;
    protected Set<Empleado> empleados;
    protected Set<Sala> salas;

    public Cine(IdCine entityId, Ubicacion ubicacion, Horario horario) {
        super(entityId);
        subscribe(new CineChange(this));
        appendChange(new CineCreado(ubicacion, horario)).apply();
    }

    private Cine(IdCine idCine){
        super(idCine);
        subscribe(new CineChange(this));
    }

    public static Cine from(IdCine idCine, List<DomainEvent> retrieveEvents) {
        var cine = new Cine(idCine);
        retrieveEvents.forEach(cine::applyEvent);
        return cine;
    }

    public void agregarSala(Numeral numeral, TipoProyeccion tipoProyeccion){
        appendChange(new SalaAgregada(new IdSala(), numeral, tipoProyeccion));
    }

    public void agregarPelicula(IdPelicula idPelicula){
        appendChange(new PeliculaAgregada(idPelicula)).apply();
    }

    public void removerPelicula(IdPelicula idPelicula){
        appendChange(new PeliculaRemovida(idPelicula)).apply();
    }

    public void agregarEmpleado(Nombre nombre, Apellidos apellidos, Cargo cargo, FechaNacimiento fechaNacimiento, Telefono telefono){
        appendChange(new EmpleadoAgregado(new IdEmpleado(), nombre, apellidos, cargo, fechaNacimiento, telefono)).apply();
    }

    public void removerEmpleado(IdEmpleado idEmpleado){
        appendChange(new EmpleadoRemovido(idEmpleado));
    }

    public void cambiarHorario(FechaInicio fechaInicio, FechaFin fechaFin, Set<Dia> dias){
        appendChange(new HorarioCambiado(fechaInicio, fechaFin, dias)).apply();
    }

    public void agregarAsientoASala(IdSala idSala, Asiento asiento){
        appendChange(new AsientoDeSalaAgregado(idSala, asiento)).apply();
    }

    public void cambiarTipoProyeccionSala(IdSala idSala, TipoProyeccion tipoProyeccion){
        appendChange(new TipoProyeccionDeSalaCambiado(idSala, tipoProyeccion)).apply();
    }

    public void cambiarTipoAsientoEnSala(IdSala idSala, IdAsiento idAsiento, TipoAsiento tipoAsiento){
        appendChange(new TipoAsientoEnSalaCambiado(idSala, idAsiento, tipoAsiento)).apply();
    }

    public void cambiarCargoEmpleado(IdEmpleado idEmpleado, Cargo cargo){
        appendChange(new CargoEmpleadoCambiado(idEmpleado, cargo)).apply();
    }

    public void cambiarTelefonoEmpleado(IdEmpleado idEmpleado, Telefono telefono){
        appendChange(new TelefonoEmpleadoCambiado(idEmpleado, telefono)).apply();
    }

    // ATRIBUTOS DEL AGREGADO
    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public Horario horario() {
        return horario;
    }

    public Set<IdPelicula> cartelera() {
        return cartelera;
    }

    public Set<Empleado> empleados() {
        return empleados;
    }

    public Set<Sala> salas() {
        return salas;
    }
}
