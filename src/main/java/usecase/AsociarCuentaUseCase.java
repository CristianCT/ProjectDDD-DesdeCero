package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.Cliente;
import domain.cliente.commands.AsociarCuentaCommand;

public class AsociarCuentaUseCase extends UseCase<RequestCommand<AsociarCuentaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsociarCuentaCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cliente = Cliente.from(command.getIdCliente(), retrieveEvents());

        cliente.asociarCuenta(command.getEmail(), command.getPassword());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
