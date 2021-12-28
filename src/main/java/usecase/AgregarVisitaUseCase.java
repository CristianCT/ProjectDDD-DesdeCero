package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cliente.Cliente;
import domain.cliente.commands.AgregarVisitaCommand;

public class AgregarVisitaUseCase extends UseCase<RequestCommand<AgregarVisitaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarVisitaCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cliente = Cliente.from(command.getIdCliente(), retrieveEvents());

        cliente.agregarVisita(command.getDetalles(), command.getFecha());
        emit().onResponse(new ResponseEvents(cliente.getUncommittedChanges()));
    }
}
