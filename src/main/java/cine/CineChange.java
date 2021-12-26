package cine;

import cine.events.*;
import cine.values.Horario;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CineChange extends EventChange {
    public CineChange(Cine cine) {
        apply((CineCreado event) -> {
            cine.ubicacion = event.getUbicacion();
            cine.horario = event.getHorario();
            cine.salas = new HashSet<>();
            cine.empleados = new HashSet<>();
            cine.cartelera = new HashSet<>();
        });

        apply((SalaAgregada event) -> {
            cine.salas.add(
                new Sala(
                    event.getIdSala(),
                    event.getNumeral(),
                    event.getTipoProyeccion()
                )
            );
        });

        apply((PeliculaAgregada event) -> {
            cine.cartelera.add(
                event.getIdPelicula()
            );
        });

        apply((PeliculaRemovida event) -> {
            cine.cartelera.removeIf(idPelicula -> idPelicula.equals(event.getIdPelicula()));
        });

        apply((EmpleadoAgregado event) -> {
            cine.empleados.add(
                new Empleado(
                    event.getIdEmpleado(),
                        event.getNombre(),
                        event.getApellidos(),
                        event.getCargo(),
                        event.getFechaNacimiento(),
                        event.getTelefono()
                )
            );
        });

        apply((EmpleadoRemovido event) -> {
            cine.empleados.removeIf(empleado -> empleado.identity().equals(event.getIdEmpleado()));
        });

        apply((HorarioCambiado event) -> {
            cine.horario = new Horario(
                event.getFechaInicio(),
                event.getFechaFin(),
                event.getDias()
            );
        });

        apply((AsientoDeSalaAgregado event) -> {
            cine.salas
                .stream()
                    .filter(sala -> sala.identity().equals(event.getIdSala()))
                    .forEach(sala -> sala.agregarAsiento(event.getAsiento()));
        });

        apply((TipoProyeccionDeSalaCambiado event) -> {
            cine.salas
                    .stream()
                    .filter(sala -> sala.identity().equals(event.getIdSala()))
                    .forEach(sala -> sala.cambiarTipoProyeccion(event.getTipoProyeccion()));
        });

        apply((TipoAsientoEnSalaCambiado event) -> {
            cine.salas
                    .stream()
                    .filter(sala -> sala.identity().equals(event.getIdSala()))
                    .forEach(sala -> sala.asientos()
                            .stream()
                            .filter(asiento -> asiento.identity().equals(event.getIdAsiento()))
                            .forEach(asiento -> asiento.cambiarTipoAsiento(event.getTipoAsiento()))
                    );
        });

        apply((CargoEmpleadoCambiado event) -> {
            cine.empleados
                    .stream()
                    .filter(empleado -> empleado.identity().equals(event.getIdEmpleado()))
                    .forEach(empleado -> empleado.cambiarCargo(event.getCargo()));
        });

        apply((TelefonoEmpleadoCambiado event) -> {
            cine.empleados
                    .stream()
                    .filter(empleado -> empleado.identity().equals(event.getIdEmpleado()))
                    .forEach(empleado -> empleado.cambiarNumeroTelefonico(event.getTelefono()));
        });
    }
}
