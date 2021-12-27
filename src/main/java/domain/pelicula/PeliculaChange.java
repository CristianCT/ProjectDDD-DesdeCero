package domain.pelicula;

import co.com.sofka.domain.generic.EventChange;
import domain.pelicula.events.*;
import domain.pelicula.values.IdBoleta;

import java.util.HashSet;

public class PeliculaChange extends EventChange {
    public PeliculaChange(Pelicula pelicula) {
        apply((PeliculaCreada event) -> {
            pelicula.titulo = event.getTitulo();
            pelicula.duracion = event.getDuracion();
            pelicula.categoria = event.getCategoria();
            pelicula.funciones = new HashSet<>();
        });

        apply((FuncionAgregada event) -> {
            pelicula.funciones.add(
                new Funcion(
                    event.getIdFuncion(),
                    event.getPrecioBase(),
                    event.getFecha()
                )
            );
        });

        apply((FechaFuncionCambiada event) -> {
            pelicula.funciones
                .stream()
                    .filter(funcion -> funcion.identity().equals(event.getIdFuncion()))
                    .forEach(funcion -> funcion.cambiarFecha(event.getFecha()));
        });

        apply((PrecioBaseFuncionCambiado event) -> {
            pelicula.funciones
                .stream()
                .filter(funcion -> funcion.identity().equals(event.getIdFuncion()))
                .forEach(funcion -> funcion.cambiarPrecioBase(event.getPrecioBase()));
        });

        apply((BoletaAgregadaAFuncion event) -> {
            pelicula.funciones
                .stream()
                .filter(funcion -> funcion.identity().equals(event.getIdFuncion()))
                .forEach(funcion -> funcion.agregarBoleta(
                    new Boleta(
                        new IdBoleta(),
                        event.getIdAsiento(),
                        event.getIdCliente(),
                        event.getTipo(),
                        event.getPrecio(),
                        event.getPago()
                    )
                ));
        });

        apply((AsientoBoletaCambiado event) -> {
            pelicula.funciones
                .stream()
                .filter(funcion -> funcion.identity().equals(event.getIdFuncion()))
                .forEach(funcion -> funcion.boletas()
                    .stream()
                    .filter(boleta -> boleta.identity().equals(event.getIdBoleta()))
                    .forEach(boleta -> boleta.cambiarAsiento(event.getIdAsiento()))
            );
        });

        apply((EstadoDePagoCambiado event) -> {
            pelicula.funciones
                .stream()
                .filter(funcion -> funcion.identity().equals(event.getIdFuncion()))
                .forEach(funcion -> funcion.boletas()
                    .stream()
                    .filter(boleta -> boleta.identity().equals(event.getIdBoleta()))
                    .forEach(boleta -> boleta.pago().cambiarEstadoPagado(event.getPagado())
            ));
        });
    }
}
