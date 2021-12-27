package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.cine.events.CineCreado;
import domain.cliente.commands.CrearClienteCommand;
import domain.cliente.events.ClienteCreado;
import domain.cliente.values.IdCliente;
import domain.genericos.Apellidos;
import domain.genericos.FechaNacimiento;
import domain.genericos.Nombre;
import domain.genericos.Telefono;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CrearCienteUseCaseTest {
    @Test
    public void crearCliente(){
        IdCliente idCliente = IdCliente.of("xxxx");
        Nombre nombre = new Nombre("nombre");
        Apellidos apellidos = new Apellidos("apellidos");
        FechaNacimiento fechaNacimiento = new FechaNacimiento(LocalDate.now());
        Telefono telefono = new Telefono(6900909);

        var command = new CrearClienteCommand(idCliente, nombre, apellidos,fechaNacimiento, telefono);
        var usecase = new CrearCienteUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow();

        ClienteCreado event = (ClienteCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("xxxx", event.aggregateRootId());
    }
}