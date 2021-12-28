package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cine.Cine;
import domain.cine.commands.RemoverEmpleadoCommand;

public class RemoverEmpleadoUseCase extends UseCase<RequestCommand<RemoverEmpleadoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<RemoverEmpleadoCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cine = Cine.from(command.getIdCine(), retrieveEvents());

        cine.removerEmpleado(command.getIdEmpleado());
        emit().onResponse(new ResponseEvents(cine.getUncommittedChanges()));
    }
}
