package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.cine.commands.CrearCineCommand;
import domain.cine.events.CineCreado;
import domain.cine.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class CrearCineUseCaseTest {

    @Test
    public void crearCine(){

        IdCine idCine = IdCine.of("xxxx");
        Ubicacion ubicacion = new Ubicacion(new Ciudad("Cartagena"), new Direccion("Transversal 70"));
        Horario horario = new Horario(new FechaInicio(LocalDate.now()), new FechaFin(LocalDate.now()), new HashSet<>());

        var command = new CrearCineCommand(idCine, ubicacion, horario);
        var usecase = new CrearCineUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow();

        CineCreado event = (CineCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
        Assertions.assertEquals(ubicacion, event.getUbicacion());
    }
}