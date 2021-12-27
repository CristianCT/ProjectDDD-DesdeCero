package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cine.Cine;
import domain.cine.commands.CrearCineCommand;

public class CrearCineUseCase extends UseCase<RequestCommand<CrearCineCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCineCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cine = new Cine(command.getIdCine(), command.getUbicacion(), command.getHorario());
        emit().onResponse(new ResponseEvents(cine.getUncommittedChanges()));
    }
}
