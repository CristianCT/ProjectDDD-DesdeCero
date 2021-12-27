package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.Cliente;
import domain.cliente.commands.CrearClienteCommand;

public class CrearCienteUseCase extends UseCase<RequestCommand<CrearClienteCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearClienteCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cliente = new Cliente(command.getIdCliente(), command.getNombre(), command.getApellidos(), command.getFechaNacimiento(), command.getTelefono());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
