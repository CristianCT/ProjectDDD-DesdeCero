package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.cine.commands.CrearCineCommand;
import domain.cine.events.CineCreado;
import domain.cine.values.*;
import domain.pelicula.commands.CrearPeliculaCommand;
import domain.pelicula.events.PeliculaCreada;
import domain.pelicula.values.Categoria;
import domain.pelicula.values.Duracion;
import domain.pelicula.values.IdPelicula;
import domain.pelicula.values.Titulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class CrearPeliculaUseCaseTest {

    @Test
    public void crearPelicula(){

        IdPelicula idPelicula = IdPelicula.of("xxxx");
        Titulo titulo = new Titulo("Pelicula");
        Duracion duracion = new Duracion("Horas", 2.5);
        Categoria categoria = new Categoria("Acción", 2000.0);


        var command = new CrearPeliculaCommand(idPelicula, titulo, duracion, categoria);
        var usecase = new CrearPeliculaUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow();

        PeliculaCreada event = (PeliculaCreada) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
    }
}