package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.Cliente;
import domain.cliente.commands.AsociarTarjetaCuentaCommand;

public class AsociarTarjetaUseCase extends UseCase<RequestCommand<AsociarTarjetaCuentaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsociarTarjetaCuentaCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cliente = Cliente.from(command.getIdCliente(), retrieveEvents());

        cliente.asociarTarjetaCuenta(command.getMembresia(), command.getCVC(), command.getFechaVencimiento(), command.getSaldo());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
